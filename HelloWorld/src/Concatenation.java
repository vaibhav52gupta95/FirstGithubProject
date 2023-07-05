import java.util.Arrays;

public class Concatenation {
    public static void main(String args[]){
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(Concatenation.getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums){
        int resultantArray[] = new int[2*nums.length];
        System.arraycopy(nums,0,resultantArray,0,nums.length);
        System.arraycopy(nums,0,resultantArray,nums.length,nums.length);
        return resultantArray;
    }
}
