package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/8.
 */
public class canCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int remain = gas[0] - cost[0];
        int stop = (start+1) % gas.length;
        while (start != stop) {
            if (remain < 0) {
                start = (start-1+gas.length) % gas.length;
                remain += gas[start] - cost[start];
            } else {
                remain += gas[stop] - cost[stop];
                stop = (stop+1) % gas.length;
            }
        }
        if (remain >= 0)
            return start;
        else return -1;

    }
}
