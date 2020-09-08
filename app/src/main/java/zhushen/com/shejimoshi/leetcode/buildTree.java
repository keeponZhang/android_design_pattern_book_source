package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/27.
 */
public class buildTree {
    //中序遍历 inorder = [9,3,15,20,7]
    //后序遍历 postorder = [9,15,7,20,3]
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null
                || inorder.length == 0 || postorder.length == 0) {
            return null;
        }

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i : inorder) {
            a.add(i);
        }

        for (int i : postorder) {
            b.add(i);
        }

        return buildTree(a, b);
    }

    public TreeNode buildTree(List<Integer> inorder, List<Integer> postorder) {
        TreeNode treeNode = null;

        Integer val = postorder.get(postorder.size() - 1);
        treeNode = new TreeNode(val);

        int i = inorder.indexOf(val);

        if (i > 0) {
            treeNode.left = buildTree(inorder.subList(0, i), postorder.subList(0, i));
        }
        if (inorder.size() - i - 1 > 0) {
            treeNode.right = buildTree(inorder.subList(i + 1, inorder.size()), postorder.subList(i, postorder.size() - 1));
        }
        return treeNode;
    }

    //前序遍历 preorder = [3,9,20,15,7]
    //中序遍历 inorder = [9,3,15,20,7]
    public TreeNode buildTree105(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, 0, inorder.length - 1);
    }

    /**
     * @param preorder 完整的先序遍历
     * @param inorder  完整的中序遍历
     * @param preSt    子树先序遍历起始点
     * @param inSt     子树中序遍历起始点
     * @param inEnd    子树中序遍历结束点
     * @return
     */
    private TreeNode build(int[] preorder, int[] inorder, int preSt, int inSt, int inEnd) {
        //递归临界点
        if (preSt > preorder.length - 1 || inSt > inEnd) {
            return null;
        }
        //先序遍历首节点为根节点
        TreeNode rootNode = new TreeNode(preorder[preSt]);
        //根节点在中序遍历的索引
        int rootIndex = 0;
        for (int i = inSt; i <= inEnd; i++) {
            if (inorder[i] == rootNode.val) {
                rootIndex = i;
                break;
            }
        }
        //左子树长度
        int leftLength = rootIndex - inSt;
        //右子树在完整先序遍历起始点
        int preStRight = preSt + leftLength + 1;
        int preStLeft = preSt + 1;

        rootNode.left = build(preorder, inorder, preStLeft, inSt, rootIndex - 1);
        rootNode.right = build(preorder, inorder, preStRight, rootIndex + 1, inEnd);
        return rootNode;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
