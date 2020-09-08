package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zhushen on 2018/11/13.
 */
public class findMode {
    HashMap<Integer,Integer> map = new HashMap();
    int max = Integer.MIN_VALUE;
    public void dfs(TreeNode root){
        if(root != null){
            if(map.containsKey(root.val)){
                if(max <= map.get(root.val))
                    max = map.get(root.val)+1;
                map.put(root.val,map.get(root.val)+1);
            }
            else{
                if(max < 1)//注意这里，我把这个忘了
                    max = 1;
                map.put(root.val,1);
            }
            dfs(root.left);
            dfs(root.right);
        }
    }
    public int[] findMode(TreeNode root) {

        dfs(root);
        ArrayList<Integer> list =new ArrayList();
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        for(Map.Entry<Integer,Integer> entry : set){
            if(entry.getValue() == max)
                list.add(entry.getKey());
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
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
