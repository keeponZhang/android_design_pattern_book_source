package zhushen.com.shejimoshi.leetcode;

import java.io.BufferedReader;

/**
 * Created by Zhushen on 2018/8/27.
 */
public class judgeCircle {
    public boolean judgeCircle(String moves) {
        int left = 0;
        int top = 0;
        for (int i = 0; i <moves.length() ; i++) {
            switch (moves.charAt(i)){
                case 'U':
                    top ++;
                    break;
                case 'D':
                    top --;
                    break;
                case 'L':
                    left ++;
                    break;
                case 'R':
                    left --;
                    break;

            }
        }

        if(left ==0&&top == 0){
            return true;
        }
        return false;
    }
}
