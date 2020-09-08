package zhushen.com.shejimoshi.leetcode;

import java.util.Date;

/**
 * Created by Zhushen on 2018/7/19.
 */
public class nthUglyNumber {
    public static void main(String[] args){
        int result = nthUglyNumber(1352);

        int time1 = (int) new Date().getTime();
        int time2 = (int) System.currentTimeMillis();

        int x = 0;
    }

    public static int nthUglyNumber(int n) {
        if(n <= 0) return 0;

        int[] uglyArray = new int[n];
        int twoIndex = 0;
        int threeIndex = 0;
        int fiveIndex = 0;
        uglyArray[0] = 1;

        for(int i = 1; i < n; i ++){
            int ugly = min(uglyArray[twoIndex]*2, uglyArray[threeIndex]*3, uglyArray[fiveIndex]*5);

            if (ugly == uglyArray[twoIndex]*2){
                twoIndex ++;
            }

            if (ugly == uglyArray[threeIndex]*3){
                threeIndex ++;
            }

            if (ugly == uglyArray[fiveIndex]*5){
                fiveIndex ++;
            }

            uglyArray[i] = ugly;

        }
        return uglyArray[n-1];
    }

    private static int min(int a, int b, int c){

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }

    public static boolean isUgly(int num) {

        if (num <= 0) {
            return false;
        }

        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;

        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
