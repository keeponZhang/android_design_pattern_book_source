package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class minMoves {


    public int minMoves(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int min = nums[0];
        int sum = 0;
        for(int num:nums){
            sum += num;
            min = min<num?min:num;
        }

        return (sum - min*nums.length);
    }

}
