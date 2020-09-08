package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class findLengthOfLCIS {
    public static void main(String[] args){

    }




    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int temp = nums[0];
        int count = 1;
        int max = 1;
        for (int num:nums) {
            if(num>temp){
                count ++ ;
                max = max<count?count:max;
            }else {
                count = 1;
            }
            temp = num;
        }
        return max;
    }
}
