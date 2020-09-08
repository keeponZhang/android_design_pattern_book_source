package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/27.
 */
public class minimumDeleteSum {
    public int minimumDeleteSum(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        dp[0][0] = 0;
        for (int j = 1; j < len2+1; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j-1);
        }
        for (int i = 1; i < len1+1; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
            for (int j = 1; j < len2+1; j++) {
                if (s1.charAt(i-1)==s2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }
        return dp[len1][len2];
    }
}
