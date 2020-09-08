package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/7/26.
 */
public class findKthLargest {
    public static void main(String[] args){
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        int result = findKthLargest(nums,4);
        int x = 0;
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
