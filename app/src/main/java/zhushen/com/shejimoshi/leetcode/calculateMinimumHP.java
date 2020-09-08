package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/30.
 */
public class calculateMinimumHP {
    public static void main(String[] args){
        int [][] dungeon  = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int result = calculateMinimumHP(dungeon);
        int x = 0;
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        if (dungeon == null || dungeon.length == 0 || dungeon[0] == null || dungeon[0].length == 0) {
            return 1;
        }
        int row = dungeon.length;
        int col = dungeon[0].length;
        int[][] dp = new int[row--][col--];
        dp[row][col] = dungeon[row][col] > 0 ? 1 : -dungeon[row][col] + 1;
        for (int j = col - 1; j >= 0; j--) {
            dp[row][j] = Math.max(dp[row][j + 1] - dungeon[row][j], 1);
        }
        int right = 0;
        int down = 0;
        for (int i = row - 1; i >= 0; i--) {
            dp[i][col] = Math.max(dp[i + 1][col] - dungeon[i][col], 1);
            for (int j = col - 1; j >= 0; j--) {
                right = Math.max(dp[i][j + 1] - dungeon[i][j], 1);
                down = Math.max(dp[i + 1][j] - dungeon[i][j], 1);
                dp[i][j] = Math.min(right, down);
            }
        }
        return dp[0][0];
    }
}
