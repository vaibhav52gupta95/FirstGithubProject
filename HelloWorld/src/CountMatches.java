import java.util.ArrayList;
import java.util.List;

public class CountMatches {
    public static void main(String args[]){
        List<List<String>> items = new ArrayList<>();
        List<String> innerList1 = new ArrayList<>();
        innerList1.add("phone");
        innerList1.add("blue");
        innerList1.add("pixel");

        List<String> innerList2 = new ArrayList<>();
        innerList2.add("computer");
        innerList2.add("silver");
        innerList2.add("lenovo");

        List<String> innerList3 = new ArrayList<>();
        innerList3.add("phone");
        innerList3.add("gold");
        innerList3.add("iphone");

        items.add(innerList1);
        items.add(innerList2);
        items.add(innerList3);
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(CountMatches.countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        for(int i=0; i< items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
                res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue))
                res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue))
                res++;
        }
        return res;
    }
}

/*class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;

        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }

        return res;

    }
    }
}*/