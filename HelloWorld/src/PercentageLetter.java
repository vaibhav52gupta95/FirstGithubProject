public class PercentageLetter {
    public static void main(String args[]){
        String s = "foobar";
        char letter = 'g';
        System.out.println(PercentageLetter.percentageLetter(s,letter));
    }
    public static int percentageLetter(String s, char letter) {
        int wordCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == letter) {
                wordCount++;
            }
        }
            return (wordCount*100/s.length());
    }
}
//if(i==s.length()-1 && s.charAt(i) != letter)
//        return 0;
