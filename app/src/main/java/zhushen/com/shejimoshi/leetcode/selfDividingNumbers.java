package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class selfDividingNumbers {
    public static void main(String[] args){
        List<Integer> list = selfDividingNumbers(1,22);
        int x = 0;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if(isDividingNumber(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isDividingNumber(int number){
        int temp = number;
        while (temp>0){
            int x = temp%10;
            if(x == 0){
                return false;
            }
            if(number%x !=0){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }
}
