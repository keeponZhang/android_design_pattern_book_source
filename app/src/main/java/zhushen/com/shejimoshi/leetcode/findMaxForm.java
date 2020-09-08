package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/29.
 */
public class findMaxForm {

    //dp[i][j] = max(dp[i][j], dp[i - zeros][j - ones] + 1);
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (String str:strs) {
            int zeros = 0;
            int ones  = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '0'){
                    zeros++;
                }else {
                    ones ++;
                }
            }

            for (int i = m; i >= zeros; --i) {
                for (int j = n; j >= ones; --j) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
        }

        return dp[m][n];
    }
}
