package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/18.
 */
public class containsNearbyDuplicate {
    public static void main(String[] args){
        int[]  nums = new int[]{99,99};
        boolean result = containsNearbyDuplicate(nums,2);
        int x = 0;

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
//            if(nums[i] == nums[i+k]){
//                return true;
//            }
            for (int j = 1; j <=k ; j++) {
                if(i+j>=nums.length){
                    continue;
                }
                if(nums[i] == nums[i+j] ){
                    return true;
                }
            }

        }
        return false;
    }
}
