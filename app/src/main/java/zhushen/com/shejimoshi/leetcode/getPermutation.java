package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class getPermutation {
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n];

        //因式分解需要的基数
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                factorial[i] = 1;
                continue;
            }
            factorial[i] = factorial[i - 1] * (i);
        }

        StringBuilder res = new StringBuilder();
        boolean[] used = new boolean[n];
        int i = n - 1;
        while (i >= 0) {
            int digit = (k - 1) / factorial[i];//变换关系k-1
            res.append(findKth(used, digit));//先取最高位的值
            k -= digit * factorial[i--];
        }
        return res.toString();
    }

    public int findKth(boolean[] used, int digit) {
        int res = -1;
        while (digit >= 0) {
            if (!used[++res]) { //从小到大的去取值，同时进行标记
                digit--;
            }
        }
        used[res] = true;
        return res + 1;//从0-4，变为1-5
    }

}
