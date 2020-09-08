package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class findFrequentTreeSum {
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null){
            return null;
        }

        List<Integer> list = new ArrayList<>();
        if(root.left == null && root.right == null){
            list.add(root.val);
        }

        //siwang


        return null;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
