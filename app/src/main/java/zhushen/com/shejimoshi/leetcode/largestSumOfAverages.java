package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/8/20.
 */
public class largestSumOfAverages {
    public static void main(String[] args){
        int[] nums = new int[]{4,1,7,5,6,2,3};
        double result = largestSumOfAverages(nums,4);

        int x = 0;
    }

    //1 2 3 4 5 6 7
    public static double largestSumOfAverages(int[] A, int K) {
        int N = A.length;
        double[] P = new double[N+1];
        for (int i = 0; i < N; ++i)
            P[i+1] = P[i] + A[i];

        double[] dp = new double[N];
        for (int i = 0; i < N; ++i)
            dp[i] = (P[N] - P[i]) / (N - i);

        for (int k = 0; k < K-1; ++k)
            for (int i = 0; i < N; ++i)
                for (int j = i+1; j < N; ++j)
                    dp[i] = Math.max(dp[i], (P[j]-P[i]) / (j-i) + dp[j]);

        return dp[0];

    }
}
