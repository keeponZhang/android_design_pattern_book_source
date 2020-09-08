package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/27.
 */
public class sumNumbers {
    public int sumNumbers(TreeNode root) {

        if(root==null) return 0;
        return sum(root,0,0);
    }

    public int  sum(TreeNode root ,int sum,int num){
        if(root.left==null && root.right==null) {
            return sum=sum+num*10+root.val;
        }
        else {
            int left=0,right=0;
            if(root.left!=null) left = sum(root.left,sum,num*10+root.val);
            if(root.right!=null) right = sum(root.right,sum,num*10+root.val);
            return left+right;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
