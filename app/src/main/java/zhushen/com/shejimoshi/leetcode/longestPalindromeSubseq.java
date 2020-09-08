package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/6.
 */
public class longestPalindromeSubseq {
    public int longestPalindromeSubseq(String s) {
        //bbbab  bbabb
        int len = s.length();
        return longestSub(s,0,len - 1);
    }
    int longestSub(String s1,int begin, int end) {
        if(begin == end) return 1;
        if(begin > end) return 0;
        if(s1.charAt(begin) == s1.charAt(end)) {
            return longestSub(s1,begin + 1,end - 1) + 2;
        } else {
            return Math.max(longestSub(s1,begin + 1,end),longestSub(s1,begin,end - 1));
        }
    }
}
