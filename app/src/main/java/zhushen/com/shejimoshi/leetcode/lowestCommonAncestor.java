package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/8.
 */
public class lowestCommonAncestor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val)
            return root;
        TreeNode leftN = lowestCommonAncestor(root.left,p,q);
        TreeNode rightN = lowestCommonAncestor(root.right,p,q);
        if(leftN != null && rightN != null)
            return root;
        if(leftN == null)
            return rightN;
        return leftN;
    }
}
