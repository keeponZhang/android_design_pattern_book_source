package zhushen.com.shejimoshi.leetcode;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Zhushen on 2018/12/5.
 */
public class findSecondMinimumValue {
    TreeSet<Integer> set = new TreeSet();
    void preOrder(TreeNode root){
        if(root != null){
            set.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public int findSecondMinimumValue(TreeNode root) {

        if(root == null)
            return -1;
        preOrder(root);
        Iterator<Integer> it = set.iterator();
        it.next();
        if(it.hasNext())
            return it.next();
        return -1;

    }

    private void secondmin(TreeNode root, int min, int min2) {
        if(root==null)return;
        else{
            if(root.val<min){
                min2=min;
                min=root.val;
            }
            else if(root.val>min&&root.val<min2)
                min2=root.val;
            secondmin(root.left,min,min2);
            secondmin(root.right,min,min2);
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
