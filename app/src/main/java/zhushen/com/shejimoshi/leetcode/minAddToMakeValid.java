package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/11/9.
 */
public class minAddToMakeValid {
    public int minAddToMakeValid(String S) {
        int len = S.length();
        int first = 0,last = 0; //first记录反括号数量，last记录括号数量
        for(int i=0;i<len;i++){
            if(S.charAt(i)=='(')last++;
            else {
                if(last==0)first++;
                else last--;
            }
        }
        return first+last;
    }
}
