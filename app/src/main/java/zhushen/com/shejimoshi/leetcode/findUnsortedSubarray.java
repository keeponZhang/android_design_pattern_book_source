package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class findUnsortedSubarray {
    public static void main(String[] args){
        int[] nums = new int[]{2,6,4,8,10,9,15};
        int result = findUnsortedSubarray( nums);
        int x = 0;
    }


    public static int findUnsortedSubarray(int[] nums) {
        // 1 2 3 4 5 6 7
        // 3 2 1 4 5 6 7
        
        int[] temp = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            temp[i] = nums[i];
        }

        Arrays.sort(nums);

        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != temp[i]){
                break;
            }else {
                result--;
            }
            if(result == 0){
                return result;
            }
        }


        for (int i = nums.length -1; i>=0; i--) {
            if(nums[i] != temp[i]){
                break;
            }else {
                result--;
            }
        }

        return result;
    }
}
