package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/4.
 */
public class numDecodings {
    //1-10
    //11-26
    //27-30
    //31-36
    //37-40
    public int numDecodings(String s) {
        if (s.isEmpty() || (s.length() > 1 && s.charAt(0) == '0')) return 0;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; ++i) {
            dp[i] = (s.charAt(i - 1) == '0') ? 0 : dp[i - 1];
            if (i > 1 && (s.charAt(i - 2) == '1' || (s.charAt(i - 2) == '2' && s.charAt(i - 1) <= '6'))) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}
