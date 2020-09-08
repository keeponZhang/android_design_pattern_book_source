package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/11/21.
 */
public class minAreaRect {
    public static void main(String[] args){

    }

    public int minAreaRect(int[][] points) {
        int min = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> x2y = new HashMap<>(); //将x相同的点，其y放在一个列表中
        //下面是x2y的初始化过程
        for(int[] point : points) {
            if(!x2y.containsKey(point[0])) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(point[1]);
                x2y.put(point[0], list);
            }else {
                x2y.get(point[0]).add(point[1]);
            }
        }
        int len = points.length;
        for(int i = 1; i < len; i++) {
            for(int j = i - 1; j >=0; j--) {
                if(points[i][0] == points[j][0] || points[i][1] == points[j][1]) {
                    continue;
                }
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];
                if(x2y.get(x1).contains(y2) && x2y.get(x2).contains(y1)) { //如果能找到这样的长方形，计算其面积
                    min = Math.min(min, Math.abs(x1 - x2) * Math.abs(y1- y2));
                }
            }
        }
        if(min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}
