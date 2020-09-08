package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class shiftingLetters {
    public static void main(String[] args){
        int[] shifts = new int[]{26,9,17};
        String result = shiftingLetters("ruu",shifts);
        int x = 0;

    }

    public static String shiftingLetters(String S, int[] shifts) {
        String str = S.substring(0,shifts.length);
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        for (int i = shifts.length-1; i >=0 ; i--) {
            sum = (sum + shifts[i])%26;
            char c = (char) ((str.charAt(i) + sum - 'a')% 26 + 'a');
            stringBuilder.append(c);
        }
        stringBuilder.reverse();
        stringBuilder.append(S.substring(shifts.length));
        return stringBuilder.toString();
    }

}
