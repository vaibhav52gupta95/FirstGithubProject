public class SumMultiply {
    public static void main(String args[]){
        int n = 799;
        System.out.println(SumMultiply.sumOfMultiples(n));
    }
    public static int sumOfMultiples(int n) {
        int sum = 0;
        int i=2;
        while(i<=n){
            if(i%3 == 0)
                sum = sum+i;
            else if (i%5 == 0)
                sum = sum+i;
            else if (i%7 == 0)
                sum = sum + i;
            i++;
        }
        return sum;
    }
}
