package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class arrangeCoins {
    public static void main(String[] args){
        int result = arrangeCoins(5);
        int x = 0;
    }


    public static int arrangeCoins(int n) {
        int i=1;
        while (n>=i){
            n -=i;
            i++;
        }

        return i-1;
    }
}
