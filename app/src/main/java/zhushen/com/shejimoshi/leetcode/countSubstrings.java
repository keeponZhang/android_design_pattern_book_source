package zhushen.com.shejimoshi.leetcode;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class countSubstrings {
    public static void main(String[] args){
        int result = countSubstrings("aaa");
        int x = 0;

    }

    public static int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length() +1; j++) {
                String string = s.substring(i,j);
                StringBuilder sb = new StringBuilder(string);
                if(sb.reverse().toString().equals(string)){
                    count++;
                }
            }
        }

        return count;
    }
}
