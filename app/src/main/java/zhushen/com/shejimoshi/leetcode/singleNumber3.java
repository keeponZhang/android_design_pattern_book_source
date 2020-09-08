package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class singleNumber3 {
    public static void main(String[] args){
        int[] nums = new int[]{43,16,45,89,45,-2147483648,45,2147483646,-2147483647,-2147483648,43,2147483647,-2147483646,-2147483648,89,-2147483646,89,-2147483646,-2147483647,2147483646,-2147483647,16,16,2147483646,43};
        int result = singleNumber(nums);
        int x = 0;
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum =0;
        for (int num:nums) {
            if(set.contains(num)){
                sum -= num;
            }else {
                set.add(num);
                sum += num;
                sum += num;
            }
        }
        return sum/2;
    }
}
