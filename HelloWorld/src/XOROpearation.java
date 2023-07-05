public class XOROpearation {
    public static void main(String args[]){
        int n =4;
        int start =3;
        System.out.println(XOROpearation.xorOperation(n,start));
    }
    public static int xorOperation(int n, int start) {
        int nums[] = new int[n];
        for (int i=0;i<n;i++) {
            nums[i] = start + 2*i;
        }
        int xor = nums[0];
        for (int k=1;k<n;k++) {
            xor = xor ^ nums[k];
        }
        return xor;
    }
}
