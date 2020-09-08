package zhushen.com.shejimoshi.leetcode;

import java.util.Map;

import static java.lang.System.arraycopy;

/**
 * Created by Zhushen on 2018/11/20.
 */
public class constructMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    private TreeNode construct(int[] nums, int start, int end){
        if (start == end){
            return null;
        }

        int maxNumPos = findNumMaxPos(nums, start, end);
        TreeNode root = new TreeNode(nums[maxNumPos]);
        root.left = construct(nums, start, maxNumPos);
        root.right = construct(nums, maxNumPos + 1, end);

        return root;
    }

    private int findNumMaxPos(int[] nums, int start, int end){
        int maxNumPos = start;
        for (int i = start; i < end; i++){
            if (nums[i] > nums[maxNumPos]){
                maxNumPos = i;
            }
        }

        return maxNumPos;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
