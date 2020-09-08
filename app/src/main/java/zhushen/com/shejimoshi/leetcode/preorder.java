package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/12/5.
 */
public class preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }
        list.add(root.val);

        for (Node child:root.children) {
            list.addAll(preorder(child));

        }

        return list;


    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
