package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/9/27.
 */
public class flipgame {
    public int flipgame(int[] fronts, int[] backs) {
        //1,2,4,4,7
        //1,3,4,1,3
        //2
        boolean flag = false;
        int result = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < fronts.length ; i++) {
            if(fronts[i] == backs[i]){
                set.add(fronts[i]);
                continue;
            }
        }

        for (int i = 0; i < fronts.length; i++) {
            if(!set.contains(fronts[i])){
                flag = true;
                result = Math.min(fronts[i],result);
            }
            if(!set.contains(backs[i])){
                flag = true;
                result = Math.min(backs[i],result);
            }
        }

        if(flag){
            return result;
        }else {
            return 0;
        }

    }
}
