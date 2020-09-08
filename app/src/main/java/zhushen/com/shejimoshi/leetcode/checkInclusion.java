package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/8/3.
 */
public class checkInclusion {
    public static void main(String[] args){
        boolean result = checkInclusion("ab","eidbaooo");
        int x = 0;
    }

    public static boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(char c : s1.toCharArray())
            c1[c-'a']++;

        for(int i=0;i<l2;i++){
            if(i>=l1)
                --c2[s2.charAt(i-l1)-'a'];//先把坐标查过的
            c2[s2.charAt(i)-'a']++;
            if(Arrays.equals(c1, c2))
                return true;
        }
        return false;
    }

}
