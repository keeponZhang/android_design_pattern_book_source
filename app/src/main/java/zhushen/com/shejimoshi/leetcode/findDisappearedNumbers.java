package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhushen on 2018/8/16.
 */
public class findDisappearedNumbers {
    public static void main(String[] args){

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a = new ArrayList<Integer>();
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=nums[nums[i]-1]) {
                temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
                i--;
            }
            System.out.println(Arrays.toString(nums));
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1) {
                a.add(i+1);
            }
        }
        return a;

    }
}
