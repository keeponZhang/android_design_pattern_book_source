package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/30.
 */
public class minDiffInBST {
    int temp = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inOrderTraversal(root);
        return min;
    }

    public void inOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        if(temp!= Integer.MIN_VALUE){
            min = Math.min(min,root.val - temp);
        }
        temp = root.val;
        inOrderTraversal(root.right);

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
