package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/16.
 */
public class findDuplicate {


    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num:nums) {
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }

        return 0;
    }
}
