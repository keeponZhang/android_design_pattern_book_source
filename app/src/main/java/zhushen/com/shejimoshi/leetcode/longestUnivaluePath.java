package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class longestUnivaluePath {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if(root == null)
            return 0;
        int leftN = dfs(root.left);
        int rightN = dfs(root.right);

        leftN = (root.left != null && root.left.val == root.val) ? leftN+1 : 0;
        rightN = (root.right != null && root.right.val == root.val) ? rightN+1 : 0;

        max = Math.max(max,leftN + rightN);
        return Math.max(leftN,rightN);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
