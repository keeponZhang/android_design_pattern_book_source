package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class singleNonDuplicate {
    public static void main(String[] args){

    }


    public int singleNonDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for (int i:nums) {
            if(set.contains(i)){
                result-=i;
            }else {
                set.add(i);
                result+=i;
            }
        }
        return result;

    }
}
