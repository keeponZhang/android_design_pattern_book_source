package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class distributeCandies {


    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();

        for (int num:candies) {
            if(!set.contains(num)){
                set.add(num);
            }
        }

        return candies.length/2<set.size()?candies.length/2:set.size();
    }
}
