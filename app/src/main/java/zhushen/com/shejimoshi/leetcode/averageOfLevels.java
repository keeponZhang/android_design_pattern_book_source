package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class averageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int count = size;
            double sum = 0.0;
            while(size > 0){
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                size--;
            }
            res.add(sum/count);
        }
        return res;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
