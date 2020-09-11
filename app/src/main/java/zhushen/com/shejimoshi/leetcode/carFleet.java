package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Zhushen on 2018/12/4.
 */
public class carFleet {
    public static void main(String[] args){
        int[] position = new int[]{10,8,0,5,3};
        int[] speed = new int[]{2,4,1,1,3};
        int result = carFleet(12,position,speed);
        int x = 0;
    }


    public static int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        int res = 0;
        //建立位置-时间的N行2列的二维数组
        double[][] cars = new double[N][2];
        for (int i = 0; i < N; i++) {
            cars[i] = new double[]{position[i], (double) (target - position[i]) / speed[i]};
        }
        Arrays.sort(cars, new Comparator<double[]>() {
            @Override
            public int compare(double[] a, double[] b) {
                return Double.compare(a[0], b[0]);
            }
        });
        double cur = 0;

        //从后往前比较
        for (int i = N - 1; i >= 0; i--) {
            if (cars[i][1] > cur) {
                cur = cars[i][1];
                res++;
            }
        }
        return res;

    }
}
