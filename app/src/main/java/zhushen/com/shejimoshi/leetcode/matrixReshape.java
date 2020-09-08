package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/17.
 */
public class matrixReshape {

    public static void main(String[] args){
        int[][] nums = new int[][]{{1,2,3,4}};
        int[][] result = matrixReshape(nums,2,2);
        int x = 0;
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int original_r = nums.length;
        int original_c = nums[0].length;
        if (original_r * original_c == r * c) {
            int[][] result = new int[r][c];
            for (int i = 0; i < r * c; i++) {
                result[i / c][i % c] = nums[i / original_c][i % original_c];
            }
            return result;
        } else {
            return nums;
        }
    }
}
