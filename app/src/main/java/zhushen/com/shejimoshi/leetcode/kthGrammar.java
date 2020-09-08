package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/29.
 */
public class kthGrammar {

    //0                                 0
    //01            +1                  1
    //0110          +4+1                6
    //01101001      +64+28+6+1          105
    public int kthGrammar(int N, int K) {
        if (N == 1) return 0;
        if (K % 2 == 0) return (kthGrammar(N - 1, K / 2) == 0) ? 1 : 0;
        else return (kthGrammar(N - 1, (K + 1) / 2) == 0) ? 0 : 1;
    }
}
