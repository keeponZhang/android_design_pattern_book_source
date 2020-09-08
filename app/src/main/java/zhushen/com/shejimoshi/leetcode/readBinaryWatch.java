package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class readBinaryWatch {
    public static void main(String[] args){

    }


    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        int[] time = new int[] { 1, 2, 4, 8, 1, 2, 4, 8, 16, 32 };
        backtrack(res, time, num, 0, 0, 0, 0);
        return res;
    }

    public void backtrack(List<String> res,int[] time,int num,int count,int start,int hour,int min) {
        if (hour > 11 || min > 59)
            return;
        if (num == count) {
            String hh = "" + hour;
            String mm = min < 10 ? "0" + min : "" + min;
            res.add(hh + ":" + mm);
            return;
        }
        for (int i = start; i < time.length; i++) {
            int newHour = i < 4 ? hour + time[i] : hour;
            int newMin = i < 4 ? min : min + time[i];
            backtrack(res, time, num, count + 1, i + 1, newHour, newMin);
        }
    }
}
