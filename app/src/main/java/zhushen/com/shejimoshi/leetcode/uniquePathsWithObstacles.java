package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/4.
 */
public class uniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(1 == obstacleGrid[i][j])
                    dp[i][j] = 0;
                else {
                    if(0 == i && 0 == j){
                        dp[i][j] = 1;
                    } else if(0 == i){
                        dp[i][j] = dp[i][j-1];
                    } else if(0 == j){
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = dp[i][j-1] + dp[i-1][j];
                    }
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static int uniquePaths(int m, int n) {
        //11111100  c 8 2
        //110     c 3 1
        //c 18 9
        int result = 1;
        for (int i = 1; i <= n-1 ; i++) {
            result *= (n + m - i-1);
        }

        //1764322560
        int x = Integer.MAX_VALUE;

        //463356416
        //2147483647
        for (int i = 0; i <n ; i++) {
            result /= (i+1);
        }
        return result;
    }

    public static void main(String[] args){
        uniquePaths(10,10);
    }
}
