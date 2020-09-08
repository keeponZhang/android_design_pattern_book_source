package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n ; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
