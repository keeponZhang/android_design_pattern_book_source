package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/17.
 */
public class canJump {

    public static void main(String[] args){
        int[] nums = new int[]{2,3,1,1,4};
        boolean result = canJump(nums);
        int x = 0;
    }

    public static boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max>nums.length){
                return true;
            }
            if(max<i){
                return false;
            }

            int val = nums[i] + i;

            max = max>val?max:val;

        }

        return true;
    }
}
