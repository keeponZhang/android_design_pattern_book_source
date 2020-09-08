package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/16.
 */
public class getHint {
    public static void main(String[] args){
        String result = getHint("1807","7810");
        int x = 0 ;
    }

    public static String getHint(String secret, String guess) {
        int sumA = 0;
        int sumB = 0;
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)){
                sumA ++;
            }else {
                a[secret.charAt(i) - '0'] ++;
                b[guess.charAt(i) - '0'] ++;
            }
        }
        for (int i = 0; i < 10; i++) {
            sumB += Math.min(a[i],b[i]);
        }

        return sumA + "A" + sumB + "B" ;
    }
}
