package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/20.
 */
public class isSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null){
            return q == null;
        }
        if(q == null){
            return p == null;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
