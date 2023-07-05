import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreatestCandies {
    public static void main(String args[]){
        int candies[] = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(GreatestCandies.kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxArrayElement=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i] > maxArrayElement){
                maxArrayElement = candies[i];
            }
        }//will get max element in array
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= maxArrayElement){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }
}
