package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/9/30.
 */
public class orderlyQueue {
    public String orderlyQueue(String S, int K) {
        if(K>1){
            char c[] = S.toCharArray();
            Arrays.sort(c);
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<S.length();i++){
                sb.append(c[i]);
            }
            return sb.toString();
        }
        String t = S;
        int len = S.length();
        S = S+S;
        for(int i = 0;i<len;i++){
            if(t.compareTo(S.substring(i,i+len))>0)
                t = S.substring(i,i+len);
        }
        return t;

    }
}
