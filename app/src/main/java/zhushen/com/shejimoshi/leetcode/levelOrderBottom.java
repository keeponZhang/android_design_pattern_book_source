package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Zhushen on 2018/11/19.
 */
public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> line = new ArrayList<>();

        if(root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        line.add(root.val);
        ans.add(line);
        line =  new ArrayList<>();

        int size = queue.size();
        int flag = 1;
        while(!queue.isEmpty()){
            TreeNode tmp  = queue.poll();
            if(tmp.left!=null){
                queue.add(tmp.left);
                line.add(tmp.left.val);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
                line.add(tmp.right.val);
            }

            size--;
            if(size==0&&line.size()>0){
                size=queue.size();
                ans.add(line);
                line = new ArrayList<>();
            }
        }
        Collections.reverse(ans);
        return ans;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
