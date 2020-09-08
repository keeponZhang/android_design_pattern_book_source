package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/9.
 */
public class findLength {
    public int findLength(int[] A, int[] B) {
        int max=0;
        int[][] samecount=new int[A.length][B.length];
        //初始化第一行第一列
        for(int i=0;i<A.length;i++){
            if(B[0]==A[i]){
                samecount[i][0]=1;
            }
        }
        for(int i=0;i<B.length;i++){
            if(B[i]==A[0]){
                samecount[0][i]=1;
            }
        }
        //初始化最后一行
        for(int row=1;row<A.length;row++){
            for(int col=1;col<B.length;col++){
                if(A[row]==B[col]){
                    //状态转移
                    samecount[row][col]=samecount[row-1][col-1]+1;
                    //全局比较
                    max=max>samecount[row][col]?max:samecount[row][col];
                }
            }
        }
        return max;
    }
}
