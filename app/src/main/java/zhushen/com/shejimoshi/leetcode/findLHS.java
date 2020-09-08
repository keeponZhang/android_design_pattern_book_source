package zhushen.com.shejimoshi.leetcode;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhushen on 2018/9/13.
 */
public class findLHS {
    public int findLHS(int[] nums) {
        int max=0;//最长和谐子序列的初值

        //将数组中的值存入哈希表
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i:nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }

        //遍历哈希表，找出最长和谐子序列
        for(Integer i:map.keySet()) {
            int value=map.get(i);
            if(map.containsKey(i+1)) {
                int value2=map.get(i+1);
                if(value+value2>max) {
                    max=value+value2;
                }
            }
        }
        return max;

    }
}
