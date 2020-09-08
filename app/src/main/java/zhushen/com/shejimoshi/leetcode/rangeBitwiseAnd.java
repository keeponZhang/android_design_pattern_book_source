package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/10.
 */
public class rangeBitwiseAnd {

    //5 7
    //101
    //111
    //110
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while(n != m)
        {
            m >>= 1;
            n >>= 1;
            count++;
        }
        return (m<<count);

    }
}
