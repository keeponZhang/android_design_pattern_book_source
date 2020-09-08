package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class findMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int num:nums) {
            if(num == 1){
                temp++;
                max = temp>max?temp:max;
            }else {
                temp = 0;
            }
        }
        return max;
    }
}
