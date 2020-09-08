package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/7.
 */
public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> LLs =new ArrayList<List<Integer>>();
        if(root==null){
            return LLs;
        }
        List<Integer> ls=new ArrayList<Integer>();
        LinkedList<TreeNode> q=new LinkedList<TreeNode>();
        q.addLast(root);
        //可以画出规律，就是这个null的标记的用法，遇到null，说明当前层出队完成，然后再入一个null，正好是下一层入完队之后
        q.addLast(null);
        while(q.size()>0){
            TreeNode T=q.removeFirst();
            if(T==null){
                //因为ls是一个引用，所以后面要clear他的时候，就要清掉引用的值，所以，用一个新的对象拿出来
                List<Integer> L=new ArrayList<Integer>();
                for(int i=0;i<ls.size();i++){
                    L.add(ls.get(i));
                }
                LLs.add(L);
                //System.out.println(LLs);
                ls.clear();
                if(q.size()==0){
                    break;
                }
                q.addLast(null);
                continue;
            }else{
                ls.add(T.val);
            }
            if(T.left!=null){
                q.addLast(T.left);
            }
            if(T.right!=null){
                q.addLast(T.right);
            }
        }
        return LLs;

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
