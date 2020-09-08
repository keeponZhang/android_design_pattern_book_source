package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class wordPattern {
    public static void main(String[] args){
        boolean result  = wordPattern("abba", "dog dog dog dog");
        int x = 0;
    }


    public static boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if(strings.length!=pattern.length()){
            return false;
        }
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            String patternItem = pattern.substring(i,i+1);
            String stringItem = strings[i];
            if(map.containsKey(patternItem)){
                if (!stringItem.equals(map.get(patternItem))){
                    return false;
                }
            }else if(map.containsValue(stringItem)){
                return false;
            }
            map.put(patternItem,stringItem);
        }
        return true;
    }
}
