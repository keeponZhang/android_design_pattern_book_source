package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class singleNumber2 {
    public static void main(String[] args){

    }

    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums) {
            if(!set.contains(num)){
                set.add(num);
            }else{
                set.remove(num);
            }
        }
        Iterator<Integer> it = set.iterator();
        int[] result = new int[]{it.next(),it.next()};
        return result;
    }
}
