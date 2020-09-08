package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class champagneTower {
    public static void main(String[] args){
        //00
        //10 11
        //20 21 22
        //30 31 32 33
    }

    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[101][101];
        tower[0][0] = poured;
        for( int r = 0 ; r <= query_row ; r++){
            for(int c = 0 ; c <= r ; c++ ){//因为下标从0开始，所以每一行的列数等于行号+1（行号也是从0开始的）
                double q = (tower[r][c] - 1.0 ) / 2.0 ;
                if(q > 0){//还可以向下一层传递
                    tower[r+1][c] += q;
                    tower[r+1][c+1] += q;
                }
            }
        }
        return Math.min(1, tower[query_row][query_glass]);
    }
}
