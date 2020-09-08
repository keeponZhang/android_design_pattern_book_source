package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/8/2.
 */
public class numSquares {


    public int numSquares(int n) {
        //1 4 9 16 25
        //1 3 5 7 9

        //n =
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1] = 1;
        for(int i = 1; i <= n; i++) {
            int sqr = (int)Math.sqrt(i);
            if(sqr * sqr == i) dp[i] = 1;  //如果 i 本身是个平方数，就将 dp[i] 置1
            else {
                for(int j = 1; j <= i/2; j++) {
                    dp[i] = Math.min(dp[j] + dp[i-j], dp[i]);  //从0开始遍历所有和为 i 的 dp，使得 dp[i]取最小
                }
            }
        }
        return dp[n];

    }
}
