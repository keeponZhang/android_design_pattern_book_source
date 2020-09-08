package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class numSubarrayProductLessThanK {
    public static void main(String[] args){

    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] * sum[i-1];
        }

        int result = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(sum[i]>sum[j]*k){
                    result++;
                }
            }
        }

        return result;
    }
}
