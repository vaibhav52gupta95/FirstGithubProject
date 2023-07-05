public class SortedArray {
    public static void main(String args[]){
        int nums[] = {0,0,0,1,1,2,2,4,5,5,5,6,6,6};
        SortedArray obj = new SortedArray();
        System.out.println(obj.removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums){
        int i =0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
