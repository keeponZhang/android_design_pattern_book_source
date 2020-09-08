package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class reverseVowels {


    public String reverseVowels(String s) {
        if(s.length()<2){
            return s;
        }

        Map<Character,Character> map = new HashMap<>();
        map.put('a','A');
        map.put('e','E');
        map.put('i','I');
        map.put('o','O');
        map.put('u','U');

        int left =0;
        int right = s.length() - 1;

        while (right > left){

        }

        return "";
    }
}
