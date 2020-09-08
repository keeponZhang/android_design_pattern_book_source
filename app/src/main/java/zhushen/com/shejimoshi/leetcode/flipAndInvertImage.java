package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/26.
 */
public class flipAndInvertImage {
    //输入: [[1,1,0],[1,0,1],[0,0,0]]
    //输出: [[1,0,0],[0,1,0],[1,1,1]]
    //解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
    //     然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]

    //输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
    //输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
    //解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
    //     然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]

    public static int[][] flipAndInvertImage(int[][] A) {
        int row = A[0].length;
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j < row/2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][row -1-j];
                A[i][row-1-j] = temp;
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < row; j++) {
                A[i][j] = 1 - A[i][j];
            }
        }

        return A;
    }

    public static void main(String[] args){
        int[][] temp = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(temp);
        int x = 0;
    }
}
