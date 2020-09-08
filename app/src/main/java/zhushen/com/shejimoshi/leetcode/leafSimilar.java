package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/20.
 */
public class leafSimilar {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        boolean retBoolean = true;
        List<Integer> leftRootList = new ArrayList<>();
        List<Integer> rightRootList = new ArrayList<>();
        getChild(root1,leftRootList);
        getChild(root2,rightRootList);
        if(leftRootList.size() != rightRootList.size()){
            return false;
        }
        for(int i=0; i<leftRootList.size(); i++){
            if(leftRootList.get(i) != rightRootList.get(i)){
                retBoolean = false;
                break;
            }
        }
        return retBoolean;
    }

    public void getChild(TreeNode treeNode,List<Integer> list){
        if(treeNode.left==null&&treeNode.right == null){
            list.add(treeNode.val);
        }
        if(treeNode.left!=null){
            getChild(treeNode.left,list);
        }

        if(treeNode.right!=null){
            getChild(treeNode.right,list);
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
