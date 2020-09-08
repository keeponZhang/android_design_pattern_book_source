package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/2.
 */
public class productExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        //1 2 3 4
        //24 12 8 6
        int[] output  = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int value = 1;
        for (int i = 0; i < nums.length; i++) {
            value *= nums[i];
            left[i] = value;
        }
        output[nums.length - 1 ] = left[nums.length-2];
        value = 1;
        for (int i = nums.length-1; i >=0 ; i--) {
            value *= nums[i];
            right[i] = value;
        }
        output[0] = right[1];

        for (int i = 1; i <nums.length - 1; i++) {
            output[i] = left[i-1] * right[i+1];
        }

        return output;
    }
}
