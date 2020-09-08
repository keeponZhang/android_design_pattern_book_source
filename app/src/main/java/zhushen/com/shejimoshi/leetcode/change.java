package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/17.
 */
public class change {
    public int change(int amount, int[] coins) {
        if(amount == 0)
            return 1;
        if(coins == null || coins.length == 0 || amount < 0)
            return 0;
        int len = coins.length;
        int[][] dp = new int[len+1][amount+1];
        for(int j = 0; j <= amount; j++ ){
            dp[len][j] = 0;
        }
        dp[len][0] = 1;
        for(int i = len-1; i >= 0; i--){
            for(int j = 0; j <= amount; j++){
                dp[i][j] = j-coins[i] >= 0 ? dp[i][j-coins[i]] + dp[i+1][j] : dp[i+1][j];
            }
        }
        return dp[0][amount];
    }
}
