package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class isPossible {
    //1 2 2 3 3 4 4 5 6 6 7 7 8 8 9 9

    //123 234 456 678 789 9
    //123 234 456 6789 789

    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }else {
                map.put(nums[i],count);
                count = 1;
            }
        }

        for (int i:map.keySet()) {
            count = map.get(i);
            map.put(i,map.get(i) -count);
            if(map.get(i + 1) <count){
                return false;
            }

        }
        return true;
    }
}
