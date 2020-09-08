package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/7.
 */
public class findTilt {
    int treeTilt = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return treeTilt;
    }

    public int dfs(TreeNode node){
        if(node == null)
            return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        treeTilt += Math.abs(left-right);
        return left + right + node.val;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
