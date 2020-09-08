package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/30.
 */
public class solveSudoku {

    public void solveSudoku(char[][] board) {
        int[][] k = new int[10][10];
        // heng
        int[][] p = new int[10][10];
        // shu
        int[][] q = new int[10][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    p[i][board[i][j] - '0'] = 1;
                    q[j][board[i][j] - '0'] = 1;
                    k[which(i, j)][board[i][j] - '0'] = 1;
                }
            }
        }

        dfs(k, p, q, board, 0, 0);
    }

    private boolean dfs(int[][] k, int[][] p, int[][] q, char[][] board, int i, int j) {
        if (j == 9) return true;
        if (board[i][j] != '.') {
            if (i + 1 < 9) {
                boolean rst = dfs(k, p, q, board, i + 1, j);
                if (rst) {
                    return true;
                }
            } else {
                boolean rst = dfs(k, p, q, board, 0, j + 1);
                if (rst) {
                    return true;
                }
            }
        } else {
            for (int x = 1; x <= 9; x++) {
                if (p[i][x] != 1 && q[j][x] != 1 && k[which(i, j)][x] != 1) {
                    p[i][x] = 1;
                    q[j][x] = 1;
                    k[which(i, j)][x] = 1;
                    board[i][j] = (char) (x + '0');
                    if (i + 1 < 9) {
                        boolean rst = dfs(k, p, q, board, i + 1, j);
                        if (rst) {
                            return true;
                        }
                    } else {
                        boolean rst = dfs(k, p, q, board, 0, j + 1);
                        if (rst) {
                            return true;
                        }
                    }
                    p[i][x] = 0;
                    q[j][x] = 0;
                    k[which(i, j)][x] = 0;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    private int which(int i, int j) {
        if (i <= 2) {
            if (j <= 2)
                return 1;
            if (j <= 5)
                return 2;
            return 3;
        }
        if (i <= 5) {
            if (j <= 2)
                return 4;
            if (j <= 5)
                return 5;
            return 6;
        }
        if (j <= 2)
            return 7;
        if (j <= 5)
            return 8;
        return 9;
    }
}
