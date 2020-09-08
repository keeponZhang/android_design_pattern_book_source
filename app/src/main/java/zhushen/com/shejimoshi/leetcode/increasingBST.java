package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;

/**
 * Created by Zhushen on 2018/11/14.
 */
public class increasingBST {
    public TreeNode increasingBST(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        recursion(root, list);
        TreeNode res = new TreeNode(Integer.MAX_VALUE);
        TreeNode result = res;
        for(int i=0;i<list.size();i++) {
            res.right=new TreeNode(list.get(i));
            res.left=null;
            res=res.right;
        }
        return result.right;
    }
    public void recursion(TreeNode root, ArrayList<Integer> list) {
        if(root==null)
            return;
        recursion(root.left, list);
        list.add(root.val);
        recursion(root.right, list);
        return;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
