public class Truncate {
    public static void main(String args[]){
        String s = "What is the solution to this problem";
        int k = 7;
        System.out.println(Truncate.truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ') {
                count++;
            }
            if(count == k){
                s = s.substring(0,i);
            }
        }
        return s;
    }
}
