package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/10.
 */
public class sortColors {
    public void sortColors(int[] nums) {
        int num1 = 0;
        int num0 = 0;

        for (int num:nums) {
            if(num == 0){
                num0++;
            }
            if(num == 1){
                num1++;
            }
        }

        for (int i = 0; i <nums.length ; i++) {
            if(i<num0){
                nums[i] = 0;
            }else if(i<num0+num1){
                nums[i] = 1;
            }else {
                nums[i] = 2;
            }
        }
    }
}
