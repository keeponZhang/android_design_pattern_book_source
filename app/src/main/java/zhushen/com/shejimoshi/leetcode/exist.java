package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/22.
 */
public class exist {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        int[][] visited = new int[m][n]; //0表示还没访问到，1表示已经访问到，不能再用了。
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (solve(board, i, j, word.toCharArray(), visited, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] board, int i, int j, char[] chars, int[][] visited, int times) {
        if (board[i][j] != chars[times]) {
            return false;
        }
        if (times == chars.length -1) {
            return true;
        }
        visited[i][j] = 1;
        if (i > 0 && visited[i-1][j] == 0 && solve(board, i-1, j, chars, visited, times +1)) {
            return true;
        }
        if (i < board.length -1 &&visited[i+1][j] == 0 && solve(board, i+1, j, chars, visited, times + 1)) {
            return true;
        }
        if (j > 0 &&visited[i][j-1] == 0 && solve(board, i, j-1, chars, visited, times +1)) {
            return true;
        }
        if (j < board[0].length -1 &&visited[i][j+1] == 0 && solve(board, i, j+1, chars, visited, times + 1)) {
            return true;
        }
        visited[i][j] = 0;
        return false;
    }
}
