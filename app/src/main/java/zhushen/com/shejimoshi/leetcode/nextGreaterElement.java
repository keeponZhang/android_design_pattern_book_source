package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Zhushen on 2018/7/19.
 */
public class nextGreaterElement {
    public static void main(String[] args){
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};

        int[] result = nextGreaterElement(nums1,nums2);
        int x = 0;

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int findLen = nums1.length;
        int numsLen = nums2.length;
        int[] res = new int[findLen];
        if (findLen == 0 || numsLen == 0 || findLen > numsLen)
            return res;
        Map<Integer, Integer> map = new HashMap<>();
        int[] stack = new int[numsLen];
        int index = -1;
        int i, j;
        int curMax = nums2[numsLen - 1];
        map.put(curMax, -1);
        for (i = numsLen - 1; i >= 0; i--) {
            while (index >= 0) {
                if (nums2[i] > stack[index])
                    --index;
                else {
                    map.put(nums2[i], stack[index]);
                    stack[++index] = nums2[i];
                    break;
                }
            }
            if (index < 0) {
                map.put(nums2[i], -1);
                stack[++index] = nums2[i];
            }
        }
        for (j = 0; j < findLen; j++) {
            res[j] = map.get(nums1[j]);
        }
        return res;

    }

    public int nextGreaterElement(int n){
        char[] chs = (n + "").toCharArray();
        int index = chs.length - 2;
        while (index >= 0) {
            if (chs[index] >= chs[index + 1]) {
                index --;
            } else {
                break;
            }
        }

        if (index == -1) {
            return -1;
        } else {
            int j = chs.length - 1;
            while (chs[j] <= chs[index]){
                j --;
            }
            char temp = chs[j];
            chs[j] = chs[index];
            chs[index] = temp;
            Arrays.sort(chs, index + 1, chs.length);
        }
        long res = Long.parseLong(new String(chs));
        return res > Integer.MAX_VALUE? -1: (int)res;

    }
}
