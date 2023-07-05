public class SubArraySum {
    public static void main(String args[]){
        int arr[] = {1,4,2,5,3};
        System.out.println(SubArraySum.sumOddLengthSubarrays(arr));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
       int sumI = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int n = i+j;
                if(n%2 == 0){
                    sumI = sumI + SubArraySum.help(arr,i,j);
                }
            }
            sumI = sumI+arr[i];
        }

        return sumI;
    }
    public static int help(int[] arr, int i, int j){
        int sum=0;
        for(int k=i;k<=j;k++){
            sum = sum+arr[k];
        }
        return sum;
    }
}
