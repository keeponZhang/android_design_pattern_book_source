package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/1.
 */
public class minDeletionSize {
    public static void main(String[] args){

    }

    //给定由 N 个小写字母字符串组成的数组 A，其中每个字符串长度相等。
    //
    //选取一个删除索引序列，对于 A 中的每个字符串，删除对应每个索引处的字符。 所余下的字符串行从上往下读形成列。
    //
    //比如，有 A = ["abcdef", "uvwxyz"]，删除索引序列 {0, 2, 3}，删除后 A 为["bef", "vyz"]， A 的列分别为["b","v"], ["e","y"], ["f","z"]。（形式上，第 n 列为 [A[0][n], A[1][n], ..., A[A.length-1][n]]）。
    //
    //假设，我们选择了一组删除索引 D，那么在执行删除操作之后，A 中所剩余的每一列都必须是 非降序 排列的，然后请你返回 D.length 的最小可能值。
    public static int minDeletionSize(String[] A) {
        char[][] s1=new char[A.length][A[0].length()];
        for(int i=0;i<A.length;i++){
            s1[i]=A[i].toCharArray();
        }
        int d=0;
        for(int j=0;j<A[0].length();j++){
            for(int i=0;i<A.length-1;i++){
                if(s1[i][j]>s1[i+1][j]){
                    d++;
                    break;
                }
            }
        }
        return d;
    }
}
