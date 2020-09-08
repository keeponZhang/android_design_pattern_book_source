package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class matrixScore {
    //0011  1111    1111
    //1010  0110    1001
    //1100  0000    1111

    //1100  1100    1111
    //1010  1010    1001
    //0011  1100    1111


    public int matrixScore(int[][] A) {
        for (int i = 0; i <A.length ; i++) {
            if(A[i][0] ==0){
                for (int j = 0; j <A[i].length ; j++) {
                    A[i][j]  = 1 - A[i][j];
                }
            }
        }

        int count = A.length;

        int result  = 0;
        for (int i = 0; i <count ; i++) {
            int temp = 0;
            for (int j = 0; j <A[i].length ; j++) {
                if(A[i][j] == 1){
                    temp++;
                }
            }
            temp = Math.max(temp,count-temp);
            result *=2;
            result += temp;


        }
        return result;

    }

}
