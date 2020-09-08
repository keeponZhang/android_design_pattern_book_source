package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class singleNumber {


    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int num:nums) {
            if(set.contains(num)){
                sum -= num;
            }else {
                set.add(num);
                sum += num;
            }
        }
        return sum;
    }
}
