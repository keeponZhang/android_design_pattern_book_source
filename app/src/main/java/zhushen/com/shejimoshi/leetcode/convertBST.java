package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/8.
 */
public class convertBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode convertBST(TreeNode root) {
        convert(root, 0);
        return root;
    }

    public int convert(TreeNode root, int rightSum){
        if(null == root){
            return rightSum;
        }
        rightSum = convert(root.right, rightSum);
        root.val = root.val + rightSum;
        rightSum = root.val;
        rightSum = convert(root.left, rightSum);
        return rightSum;
    }

}
