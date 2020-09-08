package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/8/31.
 */
public class lastRemaining {
    public int lastRemaining(int n) {
        // 1 2 3 4 5 6 7 8 9
        //   2   4   6   8
        //   2       6
        //           6
        if (n == 1)
            return 1;
        if (n <= 4)
            return 2;
        if (n % 2 != 0)
            n -= 1;
        if (n % 4 != 0)
            return 4 * lastRemaining(n / 4);
        else
            return 4 * lastRemaining(n / 4) - 2;

    }
}
