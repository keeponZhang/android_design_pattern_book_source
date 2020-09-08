package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/23.
 */
public class isBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if (Math.abs(depth(root.left) - depth(root.right)) > 1) return false;

        return isBalanced(root.left)&&isBalanced(root.right);
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;
        int left = depth(root.left); //计算左子树的深度
        int right = depth(root.right); //计算右子树的深度
        return Math.max(left, right) + 1; //返回较大值
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
