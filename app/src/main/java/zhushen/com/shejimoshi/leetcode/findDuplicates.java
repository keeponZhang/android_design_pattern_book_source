package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhushen on 2018/9/21.
 */
public class findDuplicates {
    public static void main(String[] args){
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(nums);
        int x = 0;

    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i] == nums[i-1]){
                list.add(nums[i]);
            }
        }
        return list;
    }
}
