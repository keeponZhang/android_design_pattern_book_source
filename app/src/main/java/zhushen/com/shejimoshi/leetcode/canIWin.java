package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/29.
 */
public class canIWin {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(desiredTotal <= maxChoosableInteger) return true;
        //Note: n should be <= 32 as int is 32-bit in Java; else it will 1 << 33+ equals 0.
        int n = maxChoosableInteger;
        int sum = n * (n + 1) / 2;

        if(sum < desiredTotal)  return false;

        Boolean[] dp = new Boolean[1 << n];

        return canIWin(0, n, desiredTotal, dp);
    }
    private boolean canIWin(int state, int n, int remain, Boolean[] dp) {
        if (remain <= 0) {
            //dp[state] = false;
            //Base case:
            return false;
        }

        if (dp[state] == null) {
            dp[state] = false;
            int mask = 1;
            //Key Point: take from the tail
            for(int i = 1; i <= n; i++){
                int future = state | mask;
                if (future != state && !canIWin(future, n, remain - i, dp)) {
                    //update current status = true
                    dp[state] = true;
                    break;
                }
                mask <<= 1;
            }
        }

        return dp[state];
    }
}
