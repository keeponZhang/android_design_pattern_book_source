package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/30.
 */
public class minFlipsMonoIncr {
    //00001111
    public int minFlipsMonoIncr(String S) {
        char[] chars = S.toCharArray();
        int length = chars.length;
        int[] temp = new int[length];
        int left = 0;
        int right = 0;
        for (int i = 0; i <length ; i++) {
            if(chars[i] == '1'){
                right ++;
            }
            temp[i] = chars[i]-'0';
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i <length ; i++) {
            result = Math.min(left + length - i - right,result);
            if(chars[i] == '1'){
                left ++;
                right --;
            }
        }

        result = Math.min(left,result);
        return result;
    }
}
