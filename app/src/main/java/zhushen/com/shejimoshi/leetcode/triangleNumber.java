package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class triangleNumber {
    public static void main(String[] args){

    }

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int[][] temp = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length ; j++) {
                temp[i][j] = nums[i] + nums[j];
            }
        }

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j <nums.length-1 ; j++) {
                for (int k = j+1; k <nums.length ; k++) {

                    if(temp[i][j]>nums[k]){
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
