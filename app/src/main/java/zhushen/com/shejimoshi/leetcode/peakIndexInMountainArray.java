package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/23.
 */
public class peakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        int prev = A[0];
        int next;
        for (int i = 1; i <A.length-1 ; i++) {
            next = A[i+1];
            if(A[i]>prev&&A[i]>next){
                return i;
            }
            prev = A[i];
        }
        return 0;
    }
}
