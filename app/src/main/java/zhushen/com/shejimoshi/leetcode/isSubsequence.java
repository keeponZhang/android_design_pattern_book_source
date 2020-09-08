package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/28.
 */
public class isSubsequence {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0){
            return true;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        for (int i = t.length()-1; i >=0 ; i--) {
            if(sb.charAt(0) == t.charAt(i)){
                sb.deleteCharAt(0);
                if(sb.length() == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
