package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class findTheDifference {
    public static void main(String[] args){
        char c = findTheDifference("abcd","abcde");
        int x = 0;
    }

    public static char findTheDifference(String s, String t) {
        if(s.equals("")){
            return t.charAt(0);
        }

        int length = s.length();
        int sum = 0;
        for(int i =0;i<length+1;i++){
            char c = t.charAt(i);
            sum += c;
        }
        for(int i =0;i<length;i++){
            char c = s.charAt(i);
            sum -= c;
        }

        return (char) sum;
    }
}
