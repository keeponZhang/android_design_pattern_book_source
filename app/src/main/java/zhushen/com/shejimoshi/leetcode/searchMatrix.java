package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/13.
 */
public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }

        int row = 0; int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col --;
            else row ++;
        }

        return false;

    }
}
