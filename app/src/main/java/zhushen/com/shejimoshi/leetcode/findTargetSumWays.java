package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/2.
 */
public class findTargetSumWays {
    //1, 1, 1, 1, 1 3
    //5
    public int findTargetSumWays(int[] nums, int S) {
        if (S > 1000) return 0;

        int[][] map = new int[nums.length][2001];
        map[0][1000 - nums[0]] ++;
        map[0][1000 + nums[0]] ++;
        for (int i = 1; i < nums.length; i ++) {
            for (int j = map[0].length - 1; j >= 0; j --) {
                if (j - nums[i] >= 0) map[i][j] += map[i - 1][j - nums[i]];
                if (j + nums[i] < map[0].length) map[i][j] += map[i - 1][j + nums[i]];
            }
        }

        return map[nums.length - 1][S + 1000];
    }
}
