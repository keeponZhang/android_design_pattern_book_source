package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/10/12.
 */
public class possibleBipartition {
    private Map<Integer , List<Integer>> graph = new HashMap<>();   // 图存放的数据结构
    private int[] color;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        color = new int[N + 1];
        Arrays.fill(color , - 1);
        for (int i = 1;i <= N;i ++) {
            graph.put(i , new ArrayList<Integer>());
        }
        for (int[] edge : dislikes) {                    // 将图存入Map
            int from = edge[0] , to = edge[1];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        for (int i = 1;i <= N;i ++) {                   // 未判断的节点进行判断
            if (color[i] < 0) {
                color[i] = 0;
                if (!dfs(i)) {
                    return false;
                }
            }
        }
        return true;

    }

    private boolean dfs(int current) {
        for (int next : graph.get(current)) {
            if (color[next] < 0) {
                color[next] = 1 - color[current];       //第一圈为1 第二圈为0 第三圈为1 依次类推(主要是为了判断相邻的两个层会不会染色冲突)
                if (!dfs(next)) {                       // 判断 下一节点染色是否成功 ，失败则返回false
                    return false;
                }
            } else if (color[next] == color[current]) {
                return false;                           //发现Vi 与 Vi-1 节点颜色相同
            }
        }
        return true;
    }

}
