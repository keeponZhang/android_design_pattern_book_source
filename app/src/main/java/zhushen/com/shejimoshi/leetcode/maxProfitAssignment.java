package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Zhushen on 2018/11/8.
 */
public class maxProfitAssignment {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        ArrayList<Pair> jobs = new ArrayList<>();
        for(int i=0;i<difficulty.length;i++)
            jobs.add(new Pair(difficulty[i],profit[i]));
        Collections.sort(jobs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                /*
                < return -1
                = return 0
                > return 1
                 */
                return o1.difficulty-o2.difficulty;
            }
        });
        Arrays.sort(worker);
        int ans=0;
        int best=0;
        int i= 0;
        for(int level:worker)
        {
            while (i<difficulty.length&&level>=jobs.get(i).difficulty)
                best =Math.max(best,jobs.get(i++).profit);
            ans +=best;
        }
        return ans;
    }
}

class Pair{
    int difficulty;
    int profit;
    public Pair(int difficulty, int profit) {
        this.difficulty = difficulty;
        this.profit = profit;
    }
}
