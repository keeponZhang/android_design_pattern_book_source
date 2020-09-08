package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/23.
 */
public class minCostClimbingStairs {
    public static void main(String[] args){
        int[] nums = new int[]{0,0,1,1};
        int result = minCostClimbingStairs(nums);
        int x = 0;
    }

    public static int minCostClimbingStairs(int[] cost) {
        // 1 2 2 3 4 2
        int len = cost.length;
        if(len==2)
            return Math.min(cost[0], cost[1]);
        int [] dp = new int[len+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i=2;i<=len;i++){
            dp[i] = Math.min(dp[i-2]+cost[i-2], cost[i-1]+dp[i-1]);
        }
        return dp[len];
    }
}
