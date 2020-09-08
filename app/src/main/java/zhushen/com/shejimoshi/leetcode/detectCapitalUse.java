package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class detectCapitalUse {
    public static void main(String[] args){
        //AAA Aaa aaa
        boolean result = detectCapitalUse("Test");
        int x = 0;
    }

    public static boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word)){
            return true;
        }else if(word.toLowerCase().equals(word)){
            return true;
        }
        String head = word.substring(0,1);
        String text = word.substring(1);

        if(head.toUpperCase().equals(head)&&text.toLowerCase().equals(text)){
            return true;
        }
        return false;
    }
}
