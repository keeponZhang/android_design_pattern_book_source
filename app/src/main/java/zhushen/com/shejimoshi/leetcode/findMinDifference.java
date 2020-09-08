package zhushen.com.shejimoshi.leetcode;

import java.util.List;

/**
 * Created by Zhushen on 2018/8/22.
 */
public class findMinDifference {

    public int findMinDifference(List<String> timePoints) {
        int[] values = new int[timePoints.size()];
        int i = 0;
        for (String str:timePoints) {
            values[i]  = translate(str);
            i++;
        }
        int result  =Integer.MAX_VALUE;
        for (int j = 0; j <values.length ; j++) {
            for (int k = 0; k < j; k++) {
                result = result>calc(values[j],values[k])?calc(values[j],values[k]):result;
            }
        }
        return result;
    }

    public int calc(int a,int b){
        int value = Math.abs(a-b);
        return value>720?1440-value:value;
    }

    public int translate(String str){
        String[] strings = str.split(":");
        int hour = Integer.parseInt(strings[0]);
        int min = Integer.parseInt(strings[1]);
        return hour*60+min;
    }
}
