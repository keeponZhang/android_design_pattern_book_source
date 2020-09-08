package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        int left = -1;
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == target){
                if(left == -1){
                    left = i;
                }else {
                    count ++;
                }
            }
            if(nums[i]>target){
                break;
            }
        }
        return new int[]{left,left+count};
    }
}
