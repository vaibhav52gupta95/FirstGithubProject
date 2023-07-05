public class MaxiumDepth {
    public static void main(String args[]){
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(MaxiumDepth.maxDepth(s));
    }
    public static int maxDepth(String s) {
        int counter=0;
        int maxCounter=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                counter++;
            } else if (s.charAt(i) == ')') {
                counter--;
            }
            maxCounter = Math.max(maxCounter,counter);
        }
        return maxCounter;
    }
}

/*
Simplest way I figured, create two counters, a counter and maxCounter.
Iterate through the string
everytime you see '(' counter+++
everytime you see ')' counter--
everytime check if you need to change your maxCounter( Math.max(maxCounter,counter) )
return maxCounter
*/
