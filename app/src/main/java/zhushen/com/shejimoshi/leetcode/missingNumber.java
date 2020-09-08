package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class missingNumber {
    public static void main(String[] args){

    }

    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = (length-1)*(length )/2;
        for (int num:nums){
            sum -= num;
        }
        return sum;
    }
}
