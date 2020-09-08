package zhushen.com.shejimoshi.leetcode;

import java.util.List;

/**
 * Created by Zhushen on 2018/8/10.
 */
public class merge2 {
    public List<Interval> merge(List<Interval> intervals) {
        return intervals;
    }

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
}
