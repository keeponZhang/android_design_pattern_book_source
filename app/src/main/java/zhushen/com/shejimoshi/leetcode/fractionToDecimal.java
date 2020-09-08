package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/15.
 */
public class fractionToDecimal {
    public static void main(String[] args){
        String result = fractionToDecimal(2,1);
        int x = 0;
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        String result = "";

        if(numerator%denominator ==0){
            result += numerator/denominator;
            return result;
        }

        result += numerator/denominator;
        result += ".";
        numerator = numerator%denominator;

        return result;
    }
}
