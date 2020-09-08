package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zhushen on 2018/8/21.
 */
public class findShortestSubArray {

    public int findShortestSubArray(int[] nums) {

        int maxCount = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:nums){
            if(hm.containsKey(n)){
                int temp = hm.get(n) + 1;
                hm.put(n, temp);
                if(maxCount < temp){
                    maxCount = temp;
                }
            }else{
                hm.put(n,1);
            }
        }
        Set<Integer> set = hm.keySet();
        int minDis = Integer.MAX_VALUE;
        for(int n:set){
            int temp = Integer.MAX_VALUE;
            if(hm.get(n) == maxCount){
                int i=0,j = nums.length-1;
                while(nums[i] != n && i<j)
                    i++;
                while(nums[j] != n && i<j)
                    j--;
                temp = j - i + 1;
            }
            minDis = Math.min(temp,minDis);
        }
        return minDis;
    }
}
