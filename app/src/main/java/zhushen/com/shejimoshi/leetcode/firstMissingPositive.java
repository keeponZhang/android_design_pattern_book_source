package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/8/14.
 */
public class firstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int x = 1;
        for (int num:nums) {
            if(num == x){
                x++;
            }if(num>x){
                return x;
            }
        }
        return x;
    }
}
