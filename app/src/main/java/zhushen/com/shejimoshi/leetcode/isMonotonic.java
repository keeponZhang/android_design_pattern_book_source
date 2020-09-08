package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/9/30.
 */
public class isMonotonic {

    public boolean isMonotonic(int[] A) {
        int[] temp = new int[A.length];

        for (int i = 1; i <A.length ; i++) {
            temp[i] = A[i] - A[i-1];
        }

        boolean isUp;
        Arrays.sort(temp);
        if(temp[0]<0&&temp[temp.length-1]>0){
            return false;
        }

        return true;
    }
}
