package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/8/10.
 */
public class coinChange {
    public int coinChange(int[] coins, int amount) {

        if (amount == 0) return 0;
        if (amount < 0) return -1;
        int[] nums = new int[amount+1];
        for(int i=0; i<coins.length; i++) {
            if (coins[i] <= amount) nums[coins[i]] = 1;
        }
        for(int i=1; i<amount; i++) {
            if (nums[i]==0) continue;
            for(int j=0; j<coins.length; j++) {
                if (i+coins[j] <= amount && (nums[i+coins[j]] == 0 || nums[i] + 1 < nums[i+coins[j]])) nums[i+coins[j]] = nums[i] + 1;
            }
        }
        if (nums[amount] == 0) return -1;
        return nums[amount];

    }
}
