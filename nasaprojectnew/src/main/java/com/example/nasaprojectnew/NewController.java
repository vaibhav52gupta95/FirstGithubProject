package com.example.nasaprojectnew;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

@RestController
public class NewController {

    @Value("${api.nasa.key}")
    private String apiKey = "cnYygwWnfhTHXBGRF68JfiBdcEiwQUOxoN4HRZeh";

    private static final String NASA_API_URL = "https://api.nasa.gov/planetary/apod";

    @GetMapping("/apod")
    public ResponseEntity<Map<String, Object>> getAstronomyPictureOfTheDay() {
        String url = NASA_API_URL + "?api_key=" + apiKey + "&date=" + LocalDate.now();
        HttpGet request = new HttpGet(url);
        try {
            Map<String, Object> response = HttpClientBuilder.create().build().execute(request, httpResponse -> {
                if (httpResponse.getStatusLine().getStatusCode() != HttpStatus.OK.value()) {
                    return null;
                }
                return JsonUtils.convertToMap(httpResponse.getEntity().getContent());
            });
            if (response == null) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
            return ResponseEntity.ok(response);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
