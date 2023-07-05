import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        TwoSum obj = new TwoSum();
        obj.twoSum(nums, target);
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }else map.put(nums[i],i);
        }
        return new int[] {};

//        System.out.println(result);
        //nums[i] + nums[j] == Target => nums[i] == target-nums[i]
    }
}
