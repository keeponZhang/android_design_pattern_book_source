package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/24.
 */
public class isIdealPermutation {
    public boolean isIdealPermutation(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <A.length-2 ; i++) {
            max = Math.max(max,A[i]);
            if(A[i+2]<max){
                return false;
            }
        }
        return true;
    }
}
