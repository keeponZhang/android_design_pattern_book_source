package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/10/11.
 */
public class lexicalOrder {
    //13
    //1,10,11,12,13,2,3,4,5,6,7,8,9
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>(n);
        res.add(1);
        int pre = 1;
        for (int i = 1; i < n; i++) {
            if (pre * 10 <= n) pre *= 10;
            else {
                while (pre % 10 == 9 || pre == n) pre /= 10;
                pre++;
            }
            res.add(pre);
        }
        return res;
    }
}
