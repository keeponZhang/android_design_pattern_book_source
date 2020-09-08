package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/8.
 */
public class mergeTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1!=null&&t2!=null){
            TreeNode root = new TreeNode(t1.val+t2.val);
            root.left = mergeTrees(t1.left,t2.left);
            root.right = mergeTrees(t1.right,t2.right);
            return root;
        }else if(t1!=null&&t2 == null){
            return t1;
        }else if(t1==null&&t2 != null){
            return t2;
        }else {
            return null;
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
