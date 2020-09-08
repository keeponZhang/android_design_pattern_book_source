package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/28.
 */
public class deleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        if (nums==null||nums.length==0) return 0;
        int l = nums.length;
        //用于记录 nums 中各个元素的个数
        int[] numCount = new int[10001];
        int[] dp = new int[10001];
        int max = 0;
        for (int i = 0; i < l; i++) {
            numCount[nums[i]]++;
            if (nums[i]>max) max = nums[i];
        }
        dp[0] = 0;
        dp[1] = numCount[1];
        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], numCount[i] * i + dp[i - 2]);
        }
        return dp[max];
    }
}
