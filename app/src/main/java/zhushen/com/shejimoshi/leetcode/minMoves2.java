package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/11/8.
 */
public class minMoves2 {
    //1 2 3

    //0 1 2
    public int minMoves2(int[] nums) {
        int res = 0, i = 0, j = nums.length - 1;
        Arrays.sort(nums);
        while (i < j) {
            res += nums[j--] - nums[i++];
        }
        return res;
    }
}
