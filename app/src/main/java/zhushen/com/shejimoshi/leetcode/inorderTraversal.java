package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Zhushen on 2018/11/9.
 */
public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while(true){
            if (root != null){
                stack.push(root);
                root = root.left;
            } else {
                if (stack.empty()) {
                    return list;
                }
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
