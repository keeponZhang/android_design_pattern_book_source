package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/29.
 */
public class minSwap {

    public int minSwap(int[] A, int[] B) {
        int n0 = 0,s0 = 1;

        for(int i = 1;i < A.length;i++){
            int n1 = Integer.MAX_VALUE, s1 = Integer.MAX_VALUE;
            if(A[i - 1] < A[i] && B[i - 1] < B[i]){
                n1 = Math.min(n0, n1);
                s1 = Math.min(s0 + 1, s1);
            }
            if(A[i - 1] < B[i] && B[i - 1] < A[i]){
                n1 = Math.min(s0, n1);
                s1 = Math.min(n0 + 1, s1);
            }
            n0 = n1;
            s0 = s1;
        }

        return Math.min(n0, s0);
    }
}
