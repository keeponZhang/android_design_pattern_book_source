package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/27.
 */
public class findMaxAverage {
    public static void main(String[] args){
        int[] nums = new int[]{1,12,-5,-6,50,3};
        double result = findMaxAverage(nums,4);
        int x = 0;
    }

    public static double findMaxAverage(int[] nums, int k) {
        double[] nums2 = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = (double) nums[i] /k;
        }

        double sum = 0;
        double result;
        for (int i = 0; i < k; i++) {
            sum += nums2[i];
        }

        result = sum;

        for (int i = k; i < nums2.length; i++) {
            sum += nums2[i];
            sum -= nums2[i-k];
            result = result>sum?result:sum;
        }


        return result;

    }
}
