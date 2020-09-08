package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class reconstructQueue {
    public static void main(String[] args){

    }


    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else {
                    return o2[0]-o1[0];
                }
            }
        });
        List<int[]> queue = new ArrayList<>();
        for(int[] p:people){
            queue.add(p[1], p);
        }
        return queue.toArray(new int[queue.size()][]);
    }
}
