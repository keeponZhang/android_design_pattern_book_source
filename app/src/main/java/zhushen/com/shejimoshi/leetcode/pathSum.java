package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/19.
 */
public class pathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> ans = new ArrayList<>();
            DFS(ans,new ArrayList<Integer>(),root,sum,sum);
            return ans;
    }

    public int pathSum2(TreeNode root, int sum) {
        if(root == null)
            return 0;
        return dfs(root, sum)+pathSum2(root.left, sum)+pathSum2(root.right, sum);
    }

    private int dfs(TreeNode root, int sum){
        int res = 0;
        if(root == null)
            return res;
        if(sum == root.val)
            res++;
        res+=dfs(root.left,sum - root.val);
        res+=dfs(root.right,sum - root.val);
        return res;
    }

    public void DFS(List<List<Integer>> ans,List<Integer> tmpList,TreeNode node,int sum,int remain) {
        //递归结束条件
        if(node==null)
            return;
        //业务逻辑处理
        tmpList.add(node.val);
        remain=remain-node.val;
        if(remain==0&&node.left==null&&node.right==null){
            ans.add(tmpList);
            return;
        }
        DFS(ans,new ArrayList<>(tmpList),node.left,sum,remain);
        DFS(ans,new ArrayList<>(tmpList),node.right,sum,remain);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
