import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public static void main(String args[]){
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones){
        int count =0;
//        char[] je = jewels.toCharArray(); //String to char Array
//        char[] st = stones.toCharArray();
//        for(int i=0;i<je.length;i++){ //a, A
//            for (int k=0;k<st.length;k++){
//                if(je[i] == st[k]){
//                    count++;
//                }
//            }
//        }
//        return count;
        Map<Character, Integer> stoneCount = new HashMap<>();

        // Count the occurrence of each stone type
        for (char stone : stones.toCharArray()) {
            stoneCount.put(stone, stoneCount.getOrDefault(stone, 0) + 1);
        }
        System.out.println(stoneCount);
        int jewelCount = 0;

        // Check if each stone is a jewel
        for (char jewel : jewels.toCharArray()) {
            if (stoneCount.containsKey(jewel)) {
                jewelCount += stoneCount.get(jewel);
            }
        }
        System.out.println(jewelCount);
        return count;
    }
}
