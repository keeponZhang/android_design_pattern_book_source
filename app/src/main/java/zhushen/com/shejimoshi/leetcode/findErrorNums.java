package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/16.
 */
public class findErrorNums {
    public int[] findErrorNums(int[] nums) {

        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        int sum =0;

        for (int i = 0; i <nums.length ; i++) {
            int num = nums[i];
            if(set.contains(num)){
                result[0] = num;
            }
            set.add(num);
            sum=sum + 1 + i;
            sum-= num;
        }
        result[1] = sum + result[0];


        return result;
    }
}
