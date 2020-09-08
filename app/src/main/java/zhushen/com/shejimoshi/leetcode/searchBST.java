package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/14.
 */
public class searchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }

        if(root.val == val){
            return root;
        }
        if(root.val>val){
            return searchBST(root.left,val);
        }

        return searchBST(root.right,val);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
