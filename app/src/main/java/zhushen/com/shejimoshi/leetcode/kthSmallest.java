package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/8/6.
 */
public class kthSmallest {


    public int kthSmallest(int[][] matrix, int k) {
        //a b c
        //d e f
        //g h i
        int n = matrix.length;
        int L = matrix[0][0];
        int R = matrix[n - 1][n - 1];
        int ans = 0;
        while (L <= R){
            int mid = L + (R - L )/2;
            if(guess(matrix, mid, n, k)){
                ans = mid;
                L = mid + 1;
            }else {
                R = mid - 1;
            }
        }
        return  ans;

    }

    public static boolean guess(int[][] matrix, int g, int n, int k){
        int sum = 0;
        for(int i = 0; i < n; i++){
            int L = 0;
            int R = n - 1;
            int ans = 0;
            while (L <= R){
                int mid = L + (R - L)/2;
                //若某一行值小于g，则应该是最后一个元素的下标 + 1.
                if(matrix[i][mid] < g){
                    ans = mid + 1;
                    L = mid + 1;
                }else {
                    R = mid - 1;
                }
            }
            sum += ans;
        }
        return k > sum;
    }


    public int kthSmallest(TreeNode root, int k) {
        int num = count(root.left);
        if(num == k-1)
            return root.val;
        if(num > k-1)
            return kthSmallest(root.left,k);
        return kthSmallest(root.right,k - num-1);

    }
    public int count(TreeNode root){
        if(root == null)
            return 0;
        return 1 + count(root.left) + count(root.right);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
