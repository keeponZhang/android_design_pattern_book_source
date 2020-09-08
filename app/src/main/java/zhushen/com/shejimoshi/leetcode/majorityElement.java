package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class majorityElement {
    public static void main (String[] args){

    }


    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[0] == nums[len / 2]) {
            return nums[0];
        } else if (nums[len-1] == nums[len / 2]) {
            return nums[len - 1];
        } else {
            return nums[len / 2];
        }
    }


    public List<Integer> majorityElement2(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int size = nums.length /3;
        for (int i = 0; i <nums.length - size ; i++) {
            if(nums[i] == nums[i+size]&&!list.contains(nums[i])){
                list.add(nums[i]);
                i += size;

            }
        }
        return list;
    }
}
