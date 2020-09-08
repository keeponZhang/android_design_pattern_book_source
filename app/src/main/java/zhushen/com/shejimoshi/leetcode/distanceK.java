package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class distanceK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> retList=new ArrayList<>();

        Map<TreeNode,TreeNode> parentsTreeMap=new HashMap<>();
        setParentTreeNode(root, parentsTreeMap,null);

        Queue<TreeNode> checkQueue=new LinkedList<>();
        checkQueue.add(target);

        Set<TreeNode> hasCheck=new HashSet<>();
        hasCheck.add(target);

        while(!checkQueue.isEmpty()&&K>0){
            K--;
            int size=checkQueue.size();
            for(int i=0; i<size; i++){
                TreeNode treeNode=checkQueue.poll();
                if (treeNode.left != null && hasCheck.add(treeNode.left))
                    checkQueue.add(treeNode.left);
                if (treeNode.right != null && hasCheck.add(treeNode.right))
                    checkQueue.add(treeNode.right);
                if (parentsTreeMap.containsKey(treeNode) && hasCheck.add(parentsTreeMap.get(treeNode)))
                    checkQueue.add(parentsTreeMap.get(treeNode));
            }
        }
        while (!checkQueue.isEmpty()){
            retList.add(checkQueue.poll().val);
        }
        return retList;
    }

    private void setParentTreeNode(TreeNode root, Map<TreeNode,TreeNode> parentTreeNodeMap, TreeNode parent){
        if(root == null){
            return;
        }
        if(parent != null){
            parentTreeNodeMap.put(root, parent);
        }
        setParentTreeNode(root.left,parentTreeNodeMap,root);
        setParentTreeNode(root.right,parentTreeNodeMap,root);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
