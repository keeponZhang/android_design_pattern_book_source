package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/8/14.
 */
public class binaryGap {
    public static void main(String[] args){
        int result = binaryGap(6);
        int x = 0;
    }

    //10110
    public static int binaryGap(int N) {
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int temp = 0;
        while (N>0){
            if(N%2 == 1){
                list.add(temp);
            }
            N/=2;
            temp++;
        }

        temp = list.get(0);
        for (int i:list) {
            max = (i - temp)>max?i - temp:max;
            temp = i;
        }

        return max;
    }
}
