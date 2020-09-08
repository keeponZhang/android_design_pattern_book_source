package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        List<Integer> ans = new ArrayList<>();
        if (m <= 0) {
            return ans;
        }
        int n = matrix[0].length;

        int[][] dx = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] f = new boolean[m][n];
        int cur = 0;
        int i = 0, j = 0;
        while (true) {
            ans.add(matrix[i][j]);
            f[i][j] = true;
            if (i + dx[cur][0] >= m || i + dx[cur][0] < 0
                    || j + dx[cur][1] >= n || j + dx[cur][1] < 0
                    || f[i + dx[cur][0]][j + dx[cur][1]]) {
                cur = (cur + 1) % 4;
                if (i + dx[cur][0] >= m || i + dx[cur][0] < 0
                        || j + dx[cur][1] >= n || j + dx[cur][1] < 0
                        || f[i + dx[cur][0]][j + dx[cur][1]]) {
                    break;
                }
            }
            i += dx[cur][0];
            j += dx[cur][1];
        }

        return ans;
    }
}
