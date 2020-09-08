package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/9/30.
 */
public class smallestRangeI {

    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int temp = A[A.length-1] - A[0];
        int result = temp - K *2;

        return result<0? 0:result;
    }
}
