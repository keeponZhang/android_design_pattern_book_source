package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class removeElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] == val){
                count ++;
            }else if(count>0) {
                nums[i-count] = nums[i];
            }
        }
        for (int i = 1; i <= count; i++) {
            nums[nums.length -i] = 0;
        }
        return nums.length - count;
    }
}
