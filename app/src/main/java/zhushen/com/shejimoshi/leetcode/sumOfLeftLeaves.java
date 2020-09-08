package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class sumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if(root == null){
            return 0;
        }
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
        }
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
