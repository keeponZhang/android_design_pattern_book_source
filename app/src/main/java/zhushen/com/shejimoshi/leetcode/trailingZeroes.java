package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class trailingZeroes {
    public static void main(String[] args){
        int result = trailingZeroes(3);
        int i = 0;

    }


    public static  int trailingZeroes(int n) {
        if(n<5){
            return 0;
        }
        return n /5 +  trailingZeroes(n/5);
    }
}
