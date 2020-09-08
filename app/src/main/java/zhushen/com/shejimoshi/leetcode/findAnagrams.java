package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class findAnagrams {
    public static void main(String[] args){

    }

    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        if(s == null || p == null) return result;
        int left = 0,right =0,count = p.length();
        int[] map = new int[256];
        char[] sc = s.toCharArray();
        for (char c : p.toCharArray()) map[c] ++;
        while (right < s.length()) {
            if (map[sc[right++]]-->=1) count --;
            if (count == 0) result.add(left);
            if (right - left == p.length() && map[sc[left++]]++ >=0) count++;
        }
        return result;
    }
}
