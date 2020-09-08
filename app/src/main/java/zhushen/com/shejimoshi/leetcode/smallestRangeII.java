package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/10/31.
 */
public class smallestRangeII {
    //1 3 6
    //3
    //4 6 3
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int n=A.length,i,ans=A[A.length-1]-A[0];
        for(i=0;i+1<n;i++)ans=Math.min(ans,Math.max(A[i]+K,A[n-1]-K)-Math.min(A[0]+K,A[i+1]-K));
        return ans;
    }
}
