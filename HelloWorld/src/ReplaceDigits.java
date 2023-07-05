public class ReplaceDigits {
    public static void main(String args[]){
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(ReplaceDigits.reversePrefix(word,ch));
    }
    public static String reversePrefix(String word, char ch) {
        /*
        String temp = "";
        String restString="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                temp = word.substring(0,i+1);
                restString = word.substring(i+1,word.length());
                break;
            }
            if(i==word.length()-1 && word.charAt(i) != ch)
                return word;
        }
        String tempArray[] = temp.split("\\s");
        String reverseTemp="";
        for(String t : tempArray){
            StringBuilder builder = new StringBuilder(t);
            builder.reverse();
            reverseTemp = reverseTemp + builder.toString()+"";
        }
        return reverseTemp+restString;
        */ /*Brute Force */
        int index = word.indexOf(ch);
        if(index==-1)
            return word;
        StringBuilder sb = new StringBuilder(word.substring(0,index+1));
        return sb.reverse().append(word.substring(index+1)).toString();
    }
}
