package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class find132pattern {
    public static void main(String[] args){

    }

    public boolean find132pattern(int[] nums) {
        // a b c d e f g h i
        //99 11 13 12 100 1

        if(nums == null || nums.length<3){
            return false;
        }

        int[] min = new int[nums.length];
        min[0] = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            min[i] = Math.min(nums[i- 1],min[i-1]);
        }

        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (int i = nums.length -1; i >= 0 ; i--) {
            if(nums[i] > min[i]){
                while (!stack.empty()&&nums[i] >stack.peek()){
                    max = stack.pop();
                }

                if(max>min[i]){
                    return true;
                }
            }
            stack.push(nums[i]);
        }

        return false;
    }
}
