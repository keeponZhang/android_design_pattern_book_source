package zhushen.com.shejimoshi.leetcode;

import static java.util.Arrays.sort;

/**
 * Created by Zhushen on 2018/7/24.
 */
public class maximumGap {
    public static void main(String[] args){
        int[] nums = new int[]{15252,16764,27963,7817,26155,20757,3478,22602,20404,6739,16790,10588,16521,6644,20880,15632,27078,25463,20124,15728,30042,16604,17223,4388,23646,32683,23688,12439,30630,3895,7926,22101,32406,21540,31799,3768,26679,21799,23740};
        int result = maximumGap(nums);
        int x = 0;
    }

    public static int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }

        sort(nums);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            boolean flag = false;
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    int value = nums[i] - nums[j];
                    if(value>0){
                        min = min<value?min:value;
                        flag = true;
                    }
                }
            }
            if(flag){
                result[i] = min;
            }else {
                result[i] = 0;
             }
        }

        int max = result[0];
        for (int num:result) {
            max = max>num?max:num;
        }
        return max;
    }
}
