package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class plusOne {
    public static void main(String[] args){

    }


    public int[] plusOne(int[] digits) {
        plus(digits,digits.length-1);

        return digits;
    }

    private int[] plus(int[] digits,int position){
        if(digits[position] == 9){
            digits = plus(digits,position-1);
            digits[position] = 0;
        }else {
            digits[position] ++;
        }
        return digits;
    }
}
