package zhushen.com.shejimoshi.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Zhushen on 2018/11/20.
 */
public class shortestBridge {
    //示例 1：
    //
    //输入：[[0,1],[1,0]]
    //输出：1
    //示例 2：
    //
    //输入：[[0,1,0],[0,0,0],[0,0,1]]
    //输出：2
    //示例 3：
    //
    //输入：[[1,1,1,1,1],[1,0,0,0,1],[1,0,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
    //输出：1
    public int shortestBridge(int[][] A) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int creBridgeTime = 0;
        boolean found = false;
        // DFS
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {

                if (!found && A[i][j] == 1) {
                    dfs(A, i, j);
                    found = true;
                }
                if (found && A[i][j] == 1)
                    queue.offer(new int[]{i, j});
            }
        }
        // BFS
        while (!queue.isEmpty()) {
//            for (int[] a : A)
//                System.out.println(Arrays.toString(a));
//            System.out.println("------------------------------");
            int size = queue.size();
            for (int i = 0; i < size; i++) {

                int[] point = queue.poll();
                for (int[] direction : directions) {

                    int x = point[0] + direction[0];
                    int y = point[1] + direction[1];
                    if (x < 0 || x >= A.length || y < 0 || y >= A[0].length)
                        continue;
                    if (A[x][y] == 2)
                        return creBridgeTime;
                    else if (A[x][y] == 1)
                        continue;
                    else {
                        A[x][y] = 1;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
            creBridgeTime++;
        }
        return 1;
    }


    public void dfs(int[][] A, int x, int y) {

        if (x < 0 || x >= A.length || y < 0 || y >= A[0].length || A[x][y] == 0 || A[x][y] == 2)
            return;

        A[x][y] = 2;
        dfs(A, x + 1, y);
        dfs(A, x - 1, y);
        dfs(A, x, y + 1);
        dfs(A, x, y - 1);
    }
}
