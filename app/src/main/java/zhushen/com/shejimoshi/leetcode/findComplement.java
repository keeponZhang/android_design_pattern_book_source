package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/20.
 */
public class findComplement {
    public static void main(String[] args){

        int result = findComplement(1);
        int x = 0;
    }

    public static int findComplement(int num) {
        int length = Integer.toBinaryString(num).length();

        int result = 1;

        for (int i = 0;i<length;i++){
            result *= 2;
        }

        return result - 1 - num;
    }
}
