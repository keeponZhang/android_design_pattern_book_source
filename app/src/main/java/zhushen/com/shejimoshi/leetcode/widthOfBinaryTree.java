package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class widthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        List<Integer> lefts = new ArrayList<Integer>(); // left most nodes at each level;
        int[] res = new int[1]; // max width
        dfs(root, 1, 0, lefts, res);
        return res[0];
    }
    private void dfs(TreeNode node, int id, int depth, List<Integer> lefts, int[] res) {
        if (node == null) return;
        if (depth >= lefts.size()) lefts.add(id);   // add left most node
        res[0] = Math.max(res[0], id + 1 - lefts.get(depth));
        dfs(node.left,  id * 2,     depth + 1, lefts, res);
        dfs(node.right, id * 2 + 1, depth + 1, lefts, res);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
