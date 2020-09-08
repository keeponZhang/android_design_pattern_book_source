package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/9/6.
 */
public class findAndReplacePattern {
    public static void main(String[] args){
        String[] words = new String[]{"abc","deq","mee","aqq","dkd","ccc"};
        List<String> result = findAndReplacePattern(words,"abb");
        int x = 0;
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        String temp = translate(pattern);
        List<String> result = new ArrayList<>();
        for (String str:words) {
            if(translate(str).equals(temp)){
                result.add(str);
            }
        }
        return result;

    }

    private static String translate(String string){
        int[] temp = new int[26];
        for (int i = 0; i <string.length() ; i++) {
            temp[string.charAt(i) - 'a'] = i;
        }

        String result = "";
        for (int i = 0; i <string.length() ; i++) {
            result += temp[string.charAt(i)-'a'];
        }


        return result;
    }



}
