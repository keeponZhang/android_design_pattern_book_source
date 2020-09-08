package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/26.
 */
public class findPairs {
    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,1,1};
        int result = findPairs(nums,0);
        int x = 0;
    }

//    public static int findPairs(int[] nums, int k) {
//        Set<Integer> set = new HashSet<>();
////        if(k ==0){
////            int count = 0;
////            for (int num:nums) {
////                if(set.contains(num)){
////                    count ++;
////                }else {
////                    set.add(num);
////                }
////            }
////            return count;
////        }
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j <nums.length ; j++) {
//                if(i!=j&&nums[i] - nums[j] == k){
//                    if(!set.contains(nums[i])){
//                        set.add(i);
//                    }
//                }
//            }
//        }
//        return set.size();
//    }


    public static int findPairs(int[] nums, int k) {
        if(nums.length == 0 || k < 0 ){
            return 0;
        }
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set1.contains(nums[i]+k)){
                set2.add(nums[i]);
            }
            if(set1.contains(nums[i]-k)){
                set2.add(nums[i]-k);
            }
            set1.add(nums[i]);
        }
        return set2.size();
    }
}
