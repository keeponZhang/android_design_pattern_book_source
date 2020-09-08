package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/3.
 */
public class transpose {
    public int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j < A.length; j++) {
                result[i][j] = A[j][i];
            }
        }

        return result;
    }
}
