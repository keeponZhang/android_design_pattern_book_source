package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/24.
 */
public class arrayNesting {
    public int arrayNesting(int[] nums) {
        int retData = 1;
        int length = nums.length;
        for(int i=0; i< length; i++){
            int data = i;
            int number =0;
            while (nums[data]!= length && nums[data] != i){
                number++;
                int tmpData = nums[data];
                nums[data] = length;
                data = tmpData;
            }
            retData = Math.max(number,retData);
        }
        return retData;

    }
}
