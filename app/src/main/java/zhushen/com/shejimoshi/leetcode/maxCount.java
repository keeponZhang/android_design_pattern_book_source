package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/28.
 */
public class maxCount {

    public int maxCount(int m, int n, int[][] ops) {
        int maxw = m;
        int maxh = n;
        for (int i = 0; i <ops.length ; i++) {
            int w = ops[i][0];
            int h = ops[i][1];
            maxw = Math.min(w,maxw);
            maxh = Math.min(h,maxh);
        }
        return maxh*maxw;
    }
}
