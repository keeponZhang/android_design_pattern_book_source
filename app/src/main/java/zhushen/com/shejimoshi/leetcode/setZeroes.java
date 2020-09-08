package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/9.
 */
public class setZeroes {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};//[[],[],[]]
        setZeroes(matrix);

        //0 1 2 0
        //3 4 5 2
        //1 3 1 5

        //0 0 0 0
        //0 4 5 2
        //0 3 1 5
    }

    public static void setZeroes(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    //替换行
                    for(int x = 0; x < matrix[0].length;x++){
                        if(matrix[i][x] != 0)//不等于0才替换
                            matrix[i][x] = min;
                    }
                    //替换列
                    for(int x = 0; x < matrix.length;x++){
                        if(matrix[x][j] != 0)//不等于0才替换
                            matrix[x][j] = min;
                    }
                }
            }
        }
        //替换回0
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j< matrix[0].length;j++){
                if(matrix[i][j] == min){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
