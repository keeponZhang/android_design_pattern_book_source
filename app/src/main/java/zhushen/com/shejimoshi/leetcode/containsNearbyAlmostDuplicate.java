package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/6.
 */
public class containsNearbyAlmostDuplicate {

    //[-1,2147483647]
    //1
    //2147483647
    public static void main(String[] args){
        int[] nums = new int[]{-1,2147483647};
        boolean result = containsNearbyAlmostDuplicate(nums,1,2147483647);
        int x = 0;
    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length -1 <k){
            k = nums.length - 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= k ; j++) {
                if(i-j<0){
                    continue;
                }
                int a = nums[i];
                int b = nums[i-j];
                if(Math.abs(nums[i] - nums[i-j]) <=t){
                    return true;
                }
            }
        }
        return false;
    }
}
