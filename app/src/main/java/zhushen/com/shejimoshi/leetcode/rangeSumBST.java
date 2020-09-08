package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/4.
 */
public class rangeSumBST {

    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if(root == null){
            return sum;
        }

        if(root.val<=R && root.val>=L){
            sum+= root.val;
        }
        sum += rangeSumBST(root.left,L,R);
        sum += rangeSumBST(root.right,L,R);
        return sum;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
