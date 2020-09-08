package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/13.
 */
public class getMinimumDifference {
    int minDiff = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root;

        inOrder(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
