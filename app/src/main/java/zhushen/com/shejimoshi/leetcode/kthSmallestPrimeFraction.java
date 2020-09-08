package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/23.
 */
public class kthSmallestPrimeFraction {

    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        double lo = 0.0, hi = 1.0;
        int[] ans = {-1, -1};

        while (hi-lo > 1e-9) {
            // 一直压缩精确度到1e-9
            double mid = lo + (hi - lo) / 2.0;
            int[] res = under(A, mid);
            if (res[2] < K) {
                lo = mid;
            } else {
                hi = mid;
                ans[0] = res[0];
                ans[1] = res[1];
            }
        }
        return ans;

    }

    private int[] under(int[] A, double bound) {
        // 计算有多少数小于bound
        int mol = 0, deno = 1, count = 0, i = -1;
        for (int j = 1; j < A.length; j++) {
            while (A[i + 1] < bound * A[j]) i++;
            count += i + 1;
            if (i >= 0 && mol * A[j] < deno * A[i]) {
                mol = A[i];
                deno = A[j];
            }
        }
        return new int[]{mol, deno, count};
    }
}
