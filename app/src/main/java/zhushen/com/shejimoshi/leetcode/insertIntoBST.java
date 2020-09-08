package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class insertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) { return new TreeNode(val); }
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null) {
            pre = cur;
            if (cur.val > val) {
                cur = cur.left;
                if (cur == null) {
                    pre.left = new TreeNode(val);
                }
            } else {
                cur = cur.right;
                if (cur == null) {
                    pre.right = new TreeNode(val);
                }
            }
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
