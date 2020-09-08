package zhushen.com.shejimoshi.leetcode;

import static java.util.Arrays.sort;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class twoSum {
    public static void main(String[] args){
        int[] nums = new int[]{2, 7, 11, 15};
        int[] result = twoSum(nums,9);
        int x = 0;
    }

    public static int[] twoSum(int[] nums, int target) {
        sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int sum ;
        while (i<j){
            sum = nums[i] + nums[j];
            if(sum == target){
                return new int[]{nums[i],nums[j]};
            }
            if(sum> target){
                j--;
            }
            if(sum<target){
                i++;
            }
        }
        return new int[]{nums[i],nums[j]};
    }
}
