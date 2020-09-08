package zhushen.com.shejimoshi.leetcode;

import java.util.Set;

/**
 * Created by Zhushen on 2018/9/30.
 */
public class sortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int position = 0;
        for (int num:A) {
            if(num%2 == 0){
                result[position] = num;
                position++;
            }
        }

        for (int num:A) {
            if(num%2 == 1){
                result[position] = num;
                position++;
            }
        }

        return result;
    }
}
