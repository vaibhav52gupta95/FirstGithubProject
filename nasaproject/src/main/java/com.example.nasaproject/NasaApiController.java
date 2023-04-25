package com.example.nasaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class NasaApiController {

    private static final String API_KEY = "cnYygwWnfhTHXBGRF68JfiBdcEiwQUOxoN4HRZeh";
    private static final String API_URL = "https://api.nasa.gov/planetary/apod?api_key=" + API_KEY;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/nasa")
    public @ResponseBody ResponseEntity<NasaResponse> getNasaData() {
        NasaResponse response = restTemplate.getForObject(API_URL, NasaResponse.class);
        return ResponseEntity.ok(response);
    }

}
