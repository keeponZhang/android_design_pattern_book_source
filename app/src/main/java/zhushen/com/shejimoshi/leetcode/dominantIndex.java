package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class dominantIndex {
    public static void main(String[] args){
        int[] nums = new int[]{1,0};
        int result = dominantIndex(nums);
        int x = 0;

    }


    public static int dominantIndex(int[] nums) {
        int max1 = -1;
        int max2 = -1;
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max1){
                max2 = max1;
                max1 = nums[i];
                maxIndex = i;
            }else if(nums[i] > max2){
                max2 = nums[i];
            }
        }
        return max1>=2*max2?maxIndex:-1;
    }
}
