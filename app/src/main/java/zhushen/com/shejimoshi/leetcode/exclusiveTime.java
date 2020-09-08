package zhushen.com.shejimoshi.leetcode;

import java.util.List;
import java.util.Stack;

/**
 * Created by Zhushen on 2018/11/5.
 */
public class exclusiveTime {

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack();
        int pre = 0;
        for (String log : logs) {
            String[] arr = log.split(":");
            // function_id:start_or_end:timestamp
            if (arr[1].equals("start")) {
                if (!stack.isEmpty()) {
                    res[stack.peek()] += Integer.parseInt(arr[2]) - pre;
                }
                stack.push(Integer.parseInt(arr[0]));
                pre = Integer.parseInt(arr[2]);
            } else {
                res[stack.pop()] += Integer.parseInt(arr[2]) - pre + 1;
                pre = Integer.parseInt(arr[2]) + 1;
            }
        }
        return res;
    }
}
