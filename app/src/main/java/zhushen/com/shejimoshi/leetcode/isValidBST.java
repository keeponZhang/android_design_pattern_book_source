package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class isValidBST {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = inorder(root);
        if(list.size()<=1){
            return true;
        }
        int temp = list.get(0);
        for (int i = 1; i <list.size() ; i++) {
            if(temp>=list.get(i)){
                return false;
            }
            temp = list.get(i);
        }
        return true;
    }

    public List<Integer> inorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        list.addAll(inorder(root.left));
        list.add(root.val);
        list.addAll(inorder(root.right));
        return list;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
