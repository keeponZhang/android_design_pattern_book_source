package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class moveZeroes {
    public static void main(String[] args){
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        int x = 0;
    }

    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count ++;
            }else if(count>0) {
                nums[i-count] = nums[i];
            }
        }
        for (int i = 1; i <= count; i++) {
            nums[nums.length -i] = 0;
        }
    }
}
