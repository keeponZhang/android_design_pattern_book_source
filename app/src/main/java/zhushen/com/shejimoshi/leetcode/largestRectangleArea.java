package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/11/8.
 */
public class largestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        int[][] dp = new int[heights.length][heights.length];

        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j >= 0; j--) {
                if(i == j){
                    dp[j][i] = heights[i];
                }else {
                    dp[j][i] = Math.min(dp[j+1][i],heights[j]);
                }
            }
        }
        int res = 0;

        for (int i = 0; i <heights.length ; i++) {
            for (int j = i; j >=0 ; j--) {
                res = Math.max(res,dp[j][i]*(i-j+1));
            }
        }

        return res;
    }

    public int largestRectangleArea2(int[] heights) {
        if (heights.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();

        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                int tmp = stack.pop();
                // 把当前的tmp木板作为最短木板，看能组成的最大面积是多少
                max = Math.max(max, heights[tmp] * (stack.empty() ? i : i - stack.peek() - 1));
            }
            stack.push(i);
        }

        int tmp = 0;
        int len = heights.length;
        while (!stack.isEmpty()) {
            tmp = stack.pop();
            max = Math.max(max, heights[tmp] * (stack.empty() ? len : len - stack.peek() - 1));
        }

        return max;
    }
}
