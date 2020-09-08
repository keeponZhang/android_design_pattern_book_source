package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/19.
 */
public class shortestToChar {
    public static void main(String[] args){

    }

    public int[] shortestToChar(String S, char C) {
        String c = C + "";
        int[] result = new int[S.length()];
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<S.length();i++){
            String str = S.substring(i,i+1);
            if(S.charAt(i) == C){
                set.add(i);
            }
        }

        return null;
    }
}
