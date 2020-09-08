package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/17.
 */
public class subarraySum {
    public int subarraySum(int[] nums, int k) {
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <=nums.length ; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }
        int result = 0;
        for (int i = 0; i <sum.length ; i++) {
            for (int j = 0; j < i; j++) {
                if(sum[i]- sum[j] == k){
                    result++;
                }
            }
        }
        return result;
    }
}
