package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/26.
 */
public class rotatedDigits {
    public static void main(String[] args){

    }

    public int rotatedDigits(int N) {
        //1 8 0
        //2 5 6 9
        //3 4 7
        int count = 0;
        for(int i=1;i<=N;i++){
            String str = String.valueOf(i);
            if((str.contains("2")||str.contains("5")||str.contains("6")||str.contains("9"))&&(!str.contains("3")&&!str.contains("4")&&!str.contains("7")))
                count++;
        }
        return count;
    }

    public int rotatedDigits2(int N){
        //count347      347 343 77 74 73 47 44 43 33 7 4 3
        //count180      188 180 108 100 88 81 80 8 1
        int count347 = 0;
        int count180 = 0;
        // TODO: 2018/8/22 count
        return N - count180 - count347;

    }


    private boolean judgeNumber(int n){
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","5");
        map.put("5","2");
        map.put("6","9");
        map.put("8","8");
        map.put("9","6");
        map.put("0","0");
        return false;
    }
}
