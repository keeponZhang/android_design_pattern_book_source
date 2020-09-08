package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/23.
 */
public class countNodes {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
