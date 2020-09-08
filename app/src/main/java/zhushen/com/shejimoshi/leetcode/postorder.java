package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class postorder {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        for (Node node:root.children) {
            list.addAll(postorder(node));
        }
        list.add(root.val);

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
    }
}
