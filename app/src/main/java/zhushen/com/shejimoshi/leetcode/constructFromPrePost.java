package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/6.
 */
public class constructFromPrePost {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if (pre.length <= 0) {
            return null;
        }
        return constructFromPrePostHelper(pre, post, 0, 0, post.length - 1);
    }

    private TreeNode constructFromPrePostHelper(int[] pre, int[] post, int flag, int postStart, int postEnd) {
        if (flag >= pre.length || postStart > postEnd) {
            return null;
        } else if (flag < pre.length && postStart == postEnd) {//判断没有子树的节点
            return new TreeNode(pre[flag]);
        }
        int mid = postStart;
        //判断左右子树的分隔点
        if (flag + 1 < pre.length) {
            for (; mid < postEnd; mid++) {
                if (post[mid] == pre[flag + 1]) {
                    break;
                }
            }
        }
        TreeNode node = new TreeNode(pre[flag]);
        node.left = constructFromPrePostHelper(pre, post, flag + 1, postStart, mid);
        node.right = constructFromPrePostHelper(pre, post, flag + mid - postStart + 2, mid + 1, postEnd - 1);
        return node;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
