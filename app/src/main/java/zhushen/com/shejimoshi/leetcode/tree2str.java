package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/4.
 */
public class tree2str {
    //输出: "1(2(4))(3)"
    public String tree2str(TreeNode t) {
        if(t == null){
            return "";
        }

        String string = "";
        string += t.val;
        if(t.left!=null){
            string += "(" + tree2str(t.left) + ")";
        }else if(t.right!= null){
            string += "()";
        }

        if(t.right!=null){
            string += "(" + tree2str(t.right) + ")";
        }

        return string;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
