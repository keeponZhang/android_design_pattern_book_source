package zhushen.com.shejimoshi.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Zhushen on 2018/8/27.
 */
public class findCircleNum {

    Queue<Integer> q = new LinkedList<>();

    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        for (int i = 0; i < M.length; i++) {
            if (visited[i] == 0) {
                bfs(M, visited, i);
                count++;
            }
        }
        return count;

    }

    public void bfs(int[][] M, int[] visited, int i) {
        // visit[i];
        q.offer(i);
        visited[i] = 1;
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int j = 0; j < M.length; j++) {
                // 未被访问过且是邻接点,注意是node的邻接点
                if (visited[j] == 0 && M[node][j] == 1) {
                    // visit[j];
                    q.offer(j);
                    visited[j] = 1;
                }
            }
        }

    }
}
