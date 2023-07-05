public class ReverseString {
    public static void main(String args[]){
        String s = "Let's take LeetCode contest";
        System.out.println(ReverseString.reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] word = s.split("\\s");
        String reverseWord ="";
        for(String w : word){
            StringBuilder builder = new StringBuilder(w); //to use reverse() method of stringbuilder
            builder.reverse();
            reverseWord = reverseWord + builder.toString()+" ";
        }
        return reverseWord.trim();
    }
}
