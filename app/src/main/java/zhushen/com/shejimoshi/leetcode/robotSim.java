package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/9/27.
 */
public class robotSim {

    public int robotSim(int[] commands, int[][] obstacles) {
        int max = 0;
        int[][] dx = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int k = 0;
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < obstacles.length; i++) {
            map.put(obstacles[i][0] + "," + obstacles[i][1], true);
        }
        int p = 0, q = 0;
        for (int command : commands) {
            if (command == -1) {
                k = (k + 1) % 4;
            } else if (command == -2) {
                k = (k + 4 - 1) % 4;
            } else {
                int cur[] = dx[k];
                for (int i = 0; i < command; i++) {
                    if (map.containsKey((p + cur[0]) + "," + (q + cur[1]))) {
                        break;
                    }
                    p += cur[0];
                    q += cur[1];
                }
                max = Math.max(max, p * p + q * q);
            }
        }
        return max;
    }
}
