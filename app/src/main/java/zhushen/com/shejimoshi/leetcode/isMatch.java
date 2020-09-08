package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/19.
 */
public class isMatch {
    //'.' 匹配任意单个字符。
    //'*' 匹配零个或多个前面的元素。
    public boolean isMatch(String s, String p) {
        if(p.isEmpty()) return s.isEmpty();
        boolean first_match = (!s.isEmpty()&&(s.charAt(0) == p.charAt(0)|| p.charAt(0) == '.'));
        if(p.length() >= 2 && p.charAt(1) == '*') {
            return (isMatch(s, p.substring(2)) || (first_match && isMatch(s.substring(1), p)));
        }else{
            return first_match && isMatch(s.substring(1), p.substring(1));
        }
    }
}
