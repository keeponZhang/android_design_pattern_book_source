package zhushen.com.shejimoshi.leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/10/27.
 */
public class judgePoint24 {

    public boolean judgePoint24(int[] nums) {
        ops = new int[24][4];
        permutation(nums, 0, new boolean[4], new int[4]);
        for (int i = 0; i < 24; ++i) {
            Set<Double> ans = cal(ops[i], 0, 3);
            for (double d : ans) {
                if (Math.abs(d - 24) <= 0.0000000001) return true;
            }
        }
        return false;
    }

    int[][] ops;
    int tot = 0;
    void permutation(int[] nums, int i, boolean[] vis, int[] tmp) {
        if (i == 4) {
            for (int j = 0; j < 4; ++j) {
                ops[tot][j] = tmp[j];
            }
            tot++;
            return;
        }
        for (int j = 0; j < nums.length; ++j) {
            if (!vis[j]) {
                tmp[i] = nums[j];
                vis[j] = true;
                permutation(nums, i + 1, vis, tmp);
                vis[j] = false;
            }
        }
    }

    Set<Double> cal(int[] nums, int start, int end){
        Set<Double> ans = new HashSet<>();
        if (start == end) {
            return Collections.singleton(new Double(nums[start]));
        }
        else {
            for (int i = start; i < end; ++i) {
                Set<Double> left = cal(nums, start, i);
                Set<Double> right = cal(nums, i + 1, end);
                for (double a1 : left) {
                    for (double a2 : right) {
                        ans.add(a1 + a2);
                        ans.add(a1 - a2);
                        ans.add(a1 * a2);
                        ans.add(a1 / a2);
                    }
                }
            }
            return ans;
        }
    }
}
