package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class primePalindrome {
    public static void main(String[] args){
        test(1000000);
    }

    private static void test(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if(isprime(i)&&isRepeat(i)){
                list.add(i);
            }
        }
        int x = 0;
    }

    private static boolean isRepeat(int n){
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();
        return n == Integer.parseInt(sb.toString());

    }

    public static boolean isprime(int i){
        for (int j = 2; j <= Math.sqrt(i); j++)
            if (i % j == 0) return false;
        return true;
    }


    public int primePalindrome(int N) {
        return 0;
    }
}
