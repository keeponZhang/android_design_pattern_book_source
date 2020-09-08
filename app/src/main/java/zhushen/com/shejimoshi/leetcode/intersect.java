package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class intersect {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> set = new HashMap();
        for(int n:nums1){
            if(set.containsKey(n)){
                set.put(n,set.get(n)+1);
            }else{
                set.put(n,1);
            }

        }
        int i = 0;
        for(int n:nums2){
            if(set.containsKey(n)){
                int j = set.get(n)==1?set.remove(n):set.put(n,set.get(n)-1);
                nums2[i++] = n;
            }

        }
        return Arrays.copyOfRange(nums2,0,i);
    }
}
