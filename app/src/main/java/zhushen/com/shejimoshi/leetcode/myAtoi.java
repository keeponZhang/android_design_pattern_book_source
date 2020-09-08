package zhushen.com.shejimoshi.leetcode;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Zhushen on 2018/8/22.
 */
public class myAtoi {
    public static void main(String[] args){
        int result = myAtoi("  -42");
    }

    public static int myAtoi(String str) {
        if (str.length() == 0)
            return 0;
        int sign = 1, base = 0, i = 0, n = str.length();
        while (i < n && str.charAt(i) == ' ') ++i;
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = (str.charAt(i++) == '+') ? 1 : -1;
        }
        while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }


}
