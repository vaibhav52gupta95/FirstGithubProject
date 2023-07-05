public class ReverseStringNew {
    public static void main(String args[]){
        char s[] = {'h','e','l','l','o'};
        ReverseStringNew.reverseStringNew(s);
    }
    public static void reverseStringNew(char[] s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();

        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);
        }
    }
}
