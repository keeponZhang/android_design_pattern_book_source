package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/23.
 */
public class findPeakElement {
    public static void main(String[] args){
        int[] nums = new int[]{-2147483648};
        int result = findPeakElement(nums);
        int x = 0;
    }

    public static int findPeakElement(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int next = Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            if(i<nums.length-1){
                next = nums[i+1];
            }else {
                next = Integer.MIN_VALUE;
            }
            if(nums[i]>prev&&nums[i]>next){
                return i;
            }
        }

        return 0;

    }

}
