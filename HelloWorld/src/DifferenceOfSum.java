public class DifferenceOfSum {
    public static void main(String args[]){
        int nums[] = {1,15,6,3};
        System.out.println(DifferenceOfSum.differenceOfSum(nums));
    }
    public static int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        for(int i=0;i< nums.length;i++){
            elementSum = elementSum+nums[i];

            int val = nums[i];
            while (nums[i]>0){
                digitSum = digitSum + nums[i]%10;
                nums[i] = nums[i]/10;
            }
        }
        return elementSum-digitSum;
    }
}
