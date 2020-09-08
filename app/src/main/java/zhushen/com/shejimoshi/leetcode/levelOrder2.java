package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/8.
 */
public class levelOrder2 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        res.add(list);


//        addChild()


        return res;
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
