package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;

/**
 * Created by Zhushen on 2018/11/27.
 */
public class findTarget {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        return preOrder(root,hashset,k);
    }
    public boolean preOrder(TreeNode root,HashSet<Integer> hashset,int k){
        if(root == null)
            return false;
        if(hashset.contains(k - root.val)){
            return true;
        }
        hashset.add(root.val);
        return preOrder(root.left,hashset,k) || preOrder(root.right,hashset,k);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
