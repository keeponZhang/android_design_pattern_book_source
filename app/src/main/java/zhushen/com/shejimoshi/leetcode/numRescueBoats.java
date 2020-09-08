package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/11/7.
 */
public class numRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0;
        int j = people.length-1;
        int res = 0;
        Arrays.sort(people);

        while (i<=j){
            res++;
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            }
            else j--;
        }
        return res;
    }
}
