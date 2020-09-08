package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/26.
 */
public class invertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
