import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SingleClass {
    public static void main(String args[]){
        int nums[] = {4,1,2,1,2};
        System.out.println(SingleClass.singleMethod(nums));
    }
    public static int singleMethod(int[] nums){
        Arrays.sort(nums); //{1,2,2}
        for(int i=0;i< nums.length-1;i=i+2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
