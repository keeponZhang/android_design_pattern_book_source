package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhushen on 2018/8/9.
 */
public class intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> tmp = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums2[j] > nums1[i]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                tmp.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[tmp.size()];
        for (int k = 0; k < result.length; k++) {
            result[k] = tmp.get(k);
        }
        return result;
    }
}
