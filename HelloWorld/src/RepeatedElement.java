import java.util.*;

public class RepeatedElement {
    public static void main(String args[]){
        int nums[] ={1,2,3,3};
        System.out.println(RepeatedElement.repeatedNTimes(nums));
    }
    public static Set<Integer> repeatedNTimes(int[] nums){
        /* Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int maxValue = 0;
        int maxKey = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getValue() >= maxValue){
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            } }
        return Collections.singleton(maxKey);*/
        Set<Integer> set = new HashSet<>();
        for(int i =0;i< nums.length;i++){
            if(!set.add(nums[i]))
                return Collections.singleton(nums[i]);
        }
        return Collections.singleton(0);
    }
}
