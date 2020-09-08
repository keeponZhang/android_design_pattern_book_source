package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/2.
 */
public class countRangeSum {
    //给定一个整数数组 nums，返回区间和在 [lower, upper] 之间的个数，包含 lower 和 upper。
    //区间和 S(i, j) 表示在 nums 中，位置从 i 到 j 的元素之和，包含 i 和 j (i ≤ j)。

    //输入: nums = [-2,5,-1], lower = -2, upper = 2,
    //输出: 3
    //解释: 3个区间分别是: [0,0], [2,2], [0,2]，它们表示的和分别为: -2, -1, 2。
    public int countRangeSum(int[] nums, int lower, int upper) {
        if (nums == null || nums.length == 0) return 0;
        long[] sums = new long[nums.length];
        sums[0] = nums[0];
        for(int i=1; i<nums.length; i++) sums[i] = sums[i-1] + nums[i];
        return sort(sums, 0, sums.length-1, lower, upper);
    }

    private int sort(long[] sums, int from, int to, int lower, int upper) {
        if (from > to) return 0;
        if (from == to) return (lower <= sums[from] && sums[from] <= upper) ? 1 : 0;
        int count = 0;
        int m = (from + to) / 2;
        count = sort(sums, from, m, lower, upper) + sort(sums, m+1, to, lower, upper);
        for(int i=from, j=m+1, k=m+1; i<=m; i++) {
            while (j<=to && sums[j] - sums[i] < lower) j++;
            while (k<=to && sums[k] - sums[i] <= upper) k++;
            count += k - j;
        }
        long[] merged = new long[to-from+1];
        int l=from, r=m+1;
        for(int i=0, j=from, k=m+1; i<merged.length; i++) {
            if (j>m) merged[i] = sums[k++];
            else if (k>to) merged[i] = sums[j++];
            else if (sums[j] <= sums[k]) merged[i] = sums[j++];
            else merged[i] = sums[k++];
        }
        System.arraycopy(merged, 0, sums, from, merged.length);
        return count;
    }

}
