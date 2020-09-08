package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/10/31.
 */
public class combinationSum3 {
    //找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
    //45 9
    //1 1
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        search(res, new ArrayList<Integer>(), n, k, 0);
        return res;
    }

    public void search(List<List<Integer>> res, List<Integer> temp, int n, int k,int s) {
        if (temp.size() == k)
            return;

        for (Integer i = 1; i <= 9; i++) {
            if (i >= n)
                return;
            if (!temp.contains(i)) {
                if (s + i < n && temp.size() < k) {
                    temp.add(i);
                    search(res, temp, n, k,s + i);
                    temp.remove(temp.size() - 1);
                }else if (s + i == n && temp.size() == k - 1) {
                    temp.add(i);
                    if (notIn(res, temp)) {
                        in(res, temp);
                    }
                    temp.remove(temp.size() - 1);
                    return;
                }
            }
        }
    }

    public boolean notIn(List<List<Integer>> res, List<Integer> item) {
        for (List<Integer> i : res) {
            if (i.containsAll(item))
                return false;
        }
        return true;
    }

    public void in(List<List<Integer>> res, List<Integer> item) {
        List<Integer> newList = new ArrayList<>();
        newList.addAll(item);
        res.add(newList);
    }
}
