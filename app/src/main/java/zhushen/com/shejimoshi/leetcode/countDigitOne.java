package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/25.
 */
public class countDigitOne {
    public static void main(String[] args) {
        int result  = countDigitOne(81);
        int x = 0;

    }

    public static int countDigitOne(int n) {
        // 1 -10  1 10
        // abc 1bc a1c

        //81 0-8 1  1 0-9
        int res = 0;
        for (long k = 1; k <= n; k *= 10) {
            long r = n / k, m = n % k;
            res += (r + 8) / 10 * k + (r % 10 == 1 ? m + 1 : 0);
        }
        return res;
    }

}
