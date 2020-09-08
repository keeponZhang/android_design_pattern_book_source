package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/17.
 */
public class checkSubarraySum {
    public static void main(String[] args){
        int[] nums = new int[]{0,0} ;
        boolean result = checkSubarraySum(nums,0);
        int x = 0;
    }

    public static boolean checkSubarraySum(int[] nums, int k) {

        int[] sum = new int[nums.length + 1];

        sum[0] = 0;
        sum[1] = nums[0];
        for (int i = 2; i <=nums.length ; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < i; j++) {
                if(k==0){
                    if(i-j>=2&&(sum[i] - sum[j]) ==0){
                        return true;
                    }
                }else if(i-j>=2&&(sum[i] - sum[j])%k ==0){
                    return true;
                }
            }
        }

        return false;
    }

}
