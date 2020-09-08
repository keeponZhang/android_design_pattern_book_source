package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/9/26.
 */
public class numberOfBoomerangs {
        private void put(Map<Integer, Integer> map, int d) {
            Integer count = map.get(d);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(d, count);
        }
        public int numberOfBoomerangs(int[][] points) {
            Map<Integer, Integer> distance = new HashMap<>();
            int numbers = 0;
            for(int i = 0; i < points.length; i++) {
                distance.clear();
                for(int j = 0; j < points.length; j++) {
                    if (j == i) continue;
                    int dx = points[i][0] - points[j][0];
                    int dy = points[i][1] - points[j][1];
                    int d2 = dx * dx + dy * dy;
                    put(distance, d2);
                }
                for(Map.Entry<Integer, Integer> entry : distance.entrySet()) {
                    int v = entry.getValue();
                    if (v < 2) continue;
                    numbers += v * (v - 1);
                }
            }
            return numbers;
        }

}
