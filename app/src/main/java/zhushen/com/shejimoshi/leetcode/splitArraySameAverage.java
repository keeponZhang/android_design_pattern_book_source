package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/10/19.
 */
public class splitArraySameAverage {
    public boolean splitArraySameAverage(int[] A) {
        int len = A.length;
        if(len == 1)    return false;

        int s = 0;
        for(int i : A)  s += i;
        //先排序， 后续递归可以方便剔除多于的分支
        Arrays.sort(A);
        //迭代i， 对每个i进行回溯
        for(int i = 1;i <= len / 2;i++){
            //注意这里 s* i % len == 0的判断
            if(s * i % len == 0 && nsum(A, s * i / len, i, 0))    return true;
        }

        return false;
    }

    public boolean nsum(int[] A, int target, int k, int start){
        if(k == 0)  return target == 0;
        //由于已经排好序， 这种情况就可以排除
        if(A[start] > target / k)   return false;

        for(int i = start;i < A.length - k + 1;i++){
            //剔除多于分支
            if(i > start && A[i] == A[i - 1])    continue;
            if(nsum(A, target - A[i], k - 1, i + 1))   return true;
        }
        return false;
    }

}
