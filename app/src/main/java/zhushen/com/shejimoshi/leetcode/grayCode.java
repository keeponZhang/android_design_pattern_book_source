package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/26.
 */
public class grayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        int size = 1 << n;
        for (int i = 0; i < size; i++) {
            int gradyCode = i^(i >> 1);
            list.add(gradyCode);
        }
        return list;
    }
}
