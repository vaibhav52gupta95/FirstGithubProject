public class Palindrome {
    public static void main(String args[]){
        int x = 121;
        Palindrome obj = new Palindrome();
        boolean b = obj.isPalindrome(x);
        System.out.println(b);
    }
    public boolean isPalindrome(int x){
//        String s = Integer.toString(x); //To convert integer to String
        char[] ch = ("" + x).toCharArray(); //To convert Integer to char array
        int j = ch.length -1;
        int i =0;
        while(i<j){
            if(ch[i] == ch[j]){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
