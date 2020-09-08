package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/6.
 */
public class findPoisonedDuration {
    public static void main(String[] args){
        int[] nums = new int[]{1,2};
        int result = findPoisonedDuration(nums,2);
        int x = 0;
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length ==0){
            return 0;
        }
        Arrays.sort(timeSeries);
        int sum = 0;
        int start = timeSeries[0];
        int temp = timeSeries[0] + duration;
        for (int i = 1; i < timeSeries.length ; i++) {
            if(timeSeries[i]>=temp){
                sum += (temp -start);
                start = timeSeries[i];
                temp = timeSeries[i] + duration;
            }else {
                temp = timeSeries[i]+ duration;
            }
        }
        sum += (temp -start);
        return sum;
    }
}
