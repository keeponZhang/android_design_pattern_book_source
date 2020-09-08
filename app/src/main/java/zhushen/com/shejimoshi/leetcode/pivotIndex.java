package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/20.
 */
public class pivotIndex {
    public static void main(String[] args){
        int[] nums = new int[]{1, 2, 3};
        int result = pivotIndex(nums);
        int x = 0;

    }

    public static int pivotIndex(int[] nums) {
        if(nums.length<2){
            return -1;
        }

        int left = 0,right = 0;
        for (int i:nums) {
            right += i;
        }
        right -= nums[0];

        for(int i =0;i<nums.length;i++){
            if(left == right){
                return i;
            }

            left += nums[i];
            if(nums.length - i >1 ){
                right -= nums[i+1];
            }

        }

        return -1;
    }
}
