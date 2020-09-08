package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class containsDuplicate {
    public static void main(String[] args){

    }

    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0)
            return false;
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(!s.contains(nums[i])){
                s.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
