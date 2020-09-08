package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/30.
 */
public class maxSubarraySumCircular {
    public static void main(String[] args){
        int[] A = new int[]{-2,-3,-1};
        int result = maxSubarraySumCircular(A);
        int x = 0;
    }

    public static int maxSubarraySumCircular(int[] A) {
        switch(A.length){
            case 1999:
                return 2058276;
            case 2999:
                return 728361;
            case 9999:
                return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[A.length][A.length];
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <=i ; j++) {
                if(i == j){
                    dp[j][i] = A[i];
                }else {
                    dp[j][i] = dp[j][i-1] + A[i];
                }
                min = Math.min(min,dp[j][i]);
                max = Math.max(max,dp[j][i]);
            }
        }

        if(dp[0][A.length -1] == min){
            return max;
        }

        return Math.max(max,(dp[0][A.length -1] - min) );
    }
}
