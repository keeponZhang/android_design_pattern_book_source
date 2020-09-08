package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/10/30.
 */
public class longestConsecutive {
    //[9,1,4,7,3,-1,0,5,8,-1,6]
    //-1,0,1,3,4,5,6,7,8,9,
    public int longestConsecutive(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        Arrays.sort(nums);

        int result = 1;
        int temp = nums[0];
        int max = 1;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i] - temp == 1){
                max++;
                temp = nums[i];
                result = Math.max(max,result);
            }else if(nums[i] == temp){
            }else {
                max = 1;
                temp = nums[i];
            }
        }

        return result;
    }
}
