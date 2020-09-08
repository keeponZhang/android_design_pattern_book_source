package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/10.
 */
public class maxDistToClosest {

    public int maxDistToClosest(int[] seats) {
        int max = 0;
        int maxLeft = 0;
        int maxRight = 0;
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            if(seats[i] == 1){
                break;
            }
            maxLeft ++;
        }

        for (int i = 0; i <seats.length ; i++) {
            if(seats[seats.length -1- i] == 1){
                break;
            }
            maxRight ++;
        }

        for (int i = 0; i <seats.length ; i++) {
            if(seats[i] == 1){
                count = 0;
            }else {
                count++;
                max = count>max?count:max;
            }
        }

        maxLeft = Math.max(maxLeft,maxRight);
        return Math.max(maxLeft,(max+1)/2);

    }
}
