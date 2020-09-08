package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class monotoneIncreasingDigits {
    public static void main(String[] args){
        int result = monotoneIncreasingDigits(322);
        int x = 0;
    }

    public static int monotoneIncreasingDigits(int N) {
        //corner case
        if (N <= 9) return N;

        //initialization: digits, mark
        char[] digits = String.valueOf(N).toCharArray();
        int mark = digits.length - 1;

        //for loop and get the bigger num from i - 1
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < digits[i - 1]) {
                mark = i - 1;
                digits[i - 1]--;
            }
        }

        //change the later nums into 9
        for (int j = mark + 1; j < digits.length; j++) {
            digits[j] = '9';
        }

        //return
        return Integer.parseInt(new String(digits));
    }

}
