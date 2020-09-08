package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class search {
//    public int search(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == target){
//                return i;
//            }
//        }
//        return -1;
//    }


    public boolean search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}

//1234 4321
//2134 4312