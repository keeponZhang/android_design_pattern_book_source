package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/4.
 */
public class isSubtree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null || t==null){
            return s==null && t==null;
        }

        return isSame(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSame(TreeNode s, TreeNode t){
        if(s == null && t==null){
            return true;
        }
        if(s == null||t == null){
            return false;
        }
        if(s.val!= t.val){
            return false;
        }
        return isSame(s.left,t.left)&&isSame(s.right,t.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
