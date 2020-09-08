package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class increasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int middleNum = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            if(nums[i]<=minNum){
                minNum = nums[i];
            }else if(nums[i]<=middleNum){
                middleNum = nums[i];
            }else{
                return true;
            }
        }
        return false;

    }
}
