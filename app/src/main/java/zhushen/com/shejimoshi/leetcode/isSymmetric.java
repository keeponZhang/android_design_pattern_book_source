package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/5.
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode node1, TreeNode node2) {
        if ((node1 == null && node2 == null))
            return true;
        else if (node1 != null && node2 != null) {
            if (node1.val != node2.val)
                return false;
        } else
            return false;
        return dfs(node1.left, node2.right) && dfs(node1.right, node2.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
