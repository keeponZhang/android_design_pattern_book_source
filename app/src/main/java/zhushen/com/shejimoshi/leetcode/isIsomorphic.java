package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/19.
 */
public class isIsomorphic {
    public static void main(String[] args){

    }

    public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)){
            return true;
        }

        return translate(s).equals(translate(t));
    }

    private String translate(String s){
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                sb.append(map.get(c));
            }else {
                map.put(c,index);
                index ++;
            }
        }
        return sb.toString();
    }


    public boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] map1 = new int[128];
        int[] map2 = new int[128];
        for (int i = 0; i < s.length(); i++) {
            map1[s.charAt(i)] = i;
            map2[t.charAt(i)] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
        }
        return true;
    }
}
