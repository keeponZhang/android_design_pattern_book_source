package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/31.
 */
public class projectionArea {

    public int projectionArea(int[][] grid) {
        int top = 0;
        int[] left = new int[grid.length];
        int[] right = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]!=0){
                    top++;
                }
                left[i] = Math.max(left[i],grid[i][j]);
                right[j] = Math.max(right[j],grid[i][j]);
            }
        }

        int leftSum = 0;
        int rightSum = 0;

        for (int num:left) {
            leftSum += num;
        }

        for (int num:right) {
            rightSum += num;
        }

        return top + leftSum + rightSum;

    }
}
