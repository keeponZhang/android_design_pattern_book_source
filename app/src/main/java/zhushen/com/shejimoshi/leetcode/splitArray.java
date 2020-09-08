package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/5.
 */
public class splitArray {
    public static void main(String[] args){
        int[] nums = new int[]{1,2147483646};
        int result = splitArray(nums,1);
        int x = 0;
    }

    public static int splitArray(int[] nums, int m) {
        if(m == 1){
            return sum(nums);
        }
        int low = 0;
        int high = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            high += nums[i];
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (guess(nums, mid, m)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int sum(int[] nums) {
        int sum = 0;
        for (int num:nums) {
            sum += num;
        }
        return sum;
    }

    public static boolean guess(int[] nums, int mid, int m) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > mid) {
                m--;
                sum = nums[i];
                if (nums[i] > mid) {
                    return false;
                }
            } else {
                sum += nums[i];
            }
        }
        return m == 1;
    }
}
