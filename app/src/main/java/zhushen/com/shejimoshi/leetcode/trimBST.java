package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/27.
 */
public class trimBST {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null){
            return null;
        }
        if(root.val>R){
            return trimBST(root.left,L,R);//要返回，情况中的一种，不return，返回最先压入栈的元素
        }
        if(root.val<L){
            return trimBST(root.right,L,R);
        }
        root.left = trimBST(root.left,L,R);//更新左子树
        root.right = trimBST(root.right,L,R);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
