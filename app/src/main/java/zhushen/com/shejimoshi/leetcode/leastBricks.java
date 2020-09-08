package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/9/7.
 */
public class leastBricks {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> map = new HashMap<>();
        for (List<Integer> list:wall) {
            int sum = 0;
            for (int x:list) {
                sum += x;
                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum) +1);
                }else {
                    map.put(sum,1);
                }
            }
        }
        int length = map.size();
        int[] nums = new int[length];
        int i = 0;
        for (int x :map.values()) {
            nums[i] = x;
            i++;
        }
        Arrays.sort(nums);
        if(length == 1){
            return wall.size();
        }
        return nums[length-1] - nums[length-2];
    }
}
