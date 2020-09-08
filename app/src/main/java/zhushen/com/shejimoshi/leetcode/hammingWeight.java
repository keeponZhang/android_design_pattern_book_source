package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class hammingWeight {
    public static void main(String[] args){
//        int weight = hammingWeight(2147483648);
        int x = 0;
    }

    public static int hammingWeight(int n) {
        if(n == 0){
            return 0;
        }

        int tem = 0;
        if(n%2 ==1){
            tem = 1;
        }
        return hammingWeight(n/2 ) + tem;
    }
}
