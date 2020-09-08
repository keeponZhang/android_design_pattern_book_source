package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

import static java.util.Arrays.sort;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class maximumProduct {
    public static void main(String[] args){
        int[] nums = new int[]{9,8,7,6,5,4,32,1,-1,-8};
        maximumProduct(nums);

    }

    public static int maximumProduct(int[] nums) {
        if(nums.length == 3){
            return nums[0]*nums[1]*nums[2];
        }

        Arrays.sort(nums);

        int max1 = nums[nums.length-1] * nums[nums.length-2] *nums[nums.length-3] ;
        int max2 = nums[nums.length-1] * nums[0] *nums[1] ;

        return max2>max1?max2:max1;
    }
}
