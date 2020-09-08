package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class numRabbits {
    public static void main(String[] args){

    }

    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int num:answers) {
            if(map.containsKey(num)){
                map.put(num,map.get(num) +1);
            }else {
                map.put(num,1);
            }
        }

        int sum = 0;
        for (int key:map.keySet()) {
            int value = map.get(key);
            int size = value/(key+1);
            if(value%(key +1) !=0){
                size+=1;
            }

            sum += size * (key +1);
        }

        return sum;

    }
}
