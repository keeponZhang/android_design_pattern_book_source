package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/3.
 */
public class firstUniqChar {

    public static void main(String[] args){
        int result = firstUniqChar("z");
        int x = 0;
    }

    public static int firstUniqChar(String s) {
        //leetcode
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                int value = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i),value);
            }
        }

        for (char c:map.keySet()) {
            int value = map.get(c);
            int x =0;
        }


        for (int i = 0; i < s.length(); i++) {
            int value = map.get(s.charAt(i));
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
    }
}
