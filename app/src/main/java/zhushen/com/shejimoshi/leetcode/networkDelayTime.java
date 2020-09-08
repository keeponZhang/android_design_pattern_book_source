package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/9.
 */
public class networkDelayTime {
    public static void main(String[] args){

    }

    public int networkDelayTime(int[][] times, int N, int K) {
        int INF = 0x3f3f3f3f;
        int[][] dist = new int[N][N];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                dist[i][j] = INF;
            }
        }

        for (int[] time : times) {
            int from = time[0];
            int to   = time[1];
            int cost = time[2];
            from --;
            to --;
            dist[from][to] = cost;
        }

        for (int k = 0; k < N; ++k) {
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; ++i) {
            if (i ==  K - 1) continue;
            ans = Math.max(ans, dist[K - 1][i]);
        }

        return ans >= INF ? -1 : ans;

    }
}
