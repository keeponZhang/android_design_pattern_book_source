package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class isPalindrome {
    public static void main(String[] args){
        boolean result = isPalindrome("0p");
        int x = 0;
    }


    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");
        map.put("E","e");
        map.put("F","f");
        map.put("G","g");
        map.put("H","h");
        map.put("I","i");
        map.put("J","j");
        map.put("K","k");
        map.put("L","l");
        map.put("M","m");
        map.put("N","n");
        map.put("O","o");
        map.put("P","p");
        map.put("Q","q");
        map.put("R","r");
        map.put("S","s");
        map.put("T","t");
        map.put("U","u");
        map.put("V","v");
        map.put("W","w");
        map.put("X","x");
        map.put("Y","y");
        map.put("Z","z");

        HashMap<String,String> nummap = new HashMap<>();
        nummap.put("0","0");
        nummap.put("1","1");
        nummap.put("2","2");
        nummap.put("3","3");
        nummap.put("4","4");
        nummap.put("5","5");
        nummap.put("6","6");
        nummap.put("7","7");
        nummap.put("8","8");
        nummap.put("9","9");

        for(int i =0;i<s.length();i++){
            String s1 = s.substring(i,i+1);
            if(map.containsKey(s1)){
                stringBuilder.append(map.get(s1));
            }
            if(map.containsValue(s1)){
                stringBuilder.append(s1);
            }
            if(nummap.containsValue(s1)){
                stringBuilder.append(s1);
            }
        }

        String str = stringBuilder.toString();
        stringBuilder.reverse();
        int x = 0;

        return  stringBuilder.toString().equals(str);

    }
}
