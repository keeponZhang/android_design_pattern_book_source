package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/21.
 */
public class rightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        rightmost(root, 0, list);
        return list;
    }

    private void rightmost(TreeNode root, int depth, List<Integer> list) {
        if (depth == list.size()){
            list.add(root.val);
        }
        if (root.right != null){
            rightmost(root.right, depth + 1, list);
        }
        if (root.left != null){
            rightmost(root.left, depth + 1, list);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
