package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class rotate {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
        int x = 0;
    }

    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; ++i)
        {
            for (int j = 0; j < i; ++j)
            {
                int temp = 0;
                //沿主对角线对称位置上的元素进行交换
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; ++i)
        {
            for (int j = matrix.length - 1; j >= matrix.length/ 2; --j) //注意j循环的条件为 j>=N/2
            {
                int temp = 0;
                temp = matrix[i][j];   //第i行末元素
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }


    //1 2 3 4 5 6 7
    //5 6 7 1 2 3 4
    public static void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            result[i] = nums[(nums.length+i-k)%nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }

}
