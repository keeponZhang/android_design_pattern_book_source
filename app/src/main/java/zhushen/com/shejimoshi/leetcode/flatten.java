package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/8.
 */
public class flatten {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        /*使用DFS思路找到最左子节点*/
        if (root.left != null) {
            flatten(root.left);
        }
        if (root.right != null) {
            flatten(root.right);
        }
        /*把其父节点和右子节点断开，将原左子结点连上父节点的右子节点上*/
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = null;
        /*然后再把原右子节点连到新右子节点的右子节点上*/
        while (root.right != null) {
            root = root.right;
        }
        root.right = tmp;
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
