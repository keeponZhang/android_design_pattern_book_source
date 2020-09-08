package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/9/5.
 */
public class findMinArrowShots {
    public int findMinArrowShots(int[][] points) {
        //2 8  10 16  7 12  1 6

        if(points.length == 0) return 0;
//        Arrays.sort(points,(a, b) -> (a[1] - b[1]));
        int curPos = points[0][1];
        int ret = 1;
        for (int i = 1; i < points.length; i++) {
            if(points[i][0] <= curPos) {
                continue;
            }
            curPos = points[i][1];
            ret++;
        }
        return ret;
    }
}
