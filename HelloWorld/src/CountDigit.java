public class CountDigit {
    public static void main(String args[]){
        int num = 121;
        System.out.println(CountDigit.countDigits(num));
    }
    public static int countDigits(int num) {
        int count =0;
        int temp = num;
        while(num!=0){
            if(temp%(num%10)== 0){
                count++;
                num = num/10;
            }
            else
                num = num/10;
        }
        return count;
    }
}
