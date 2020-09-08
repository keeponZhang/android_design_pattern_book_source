package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class countBits {
    public static void main(String[] args){
        int[] result = countBits(5);
        int x = 0;
    }

    public static int[] countBits(int num) {
        if(num == 0){
            return  new int[]{0};
        }
        if(num == 1){
            return new int[]{0,1};
        }
        int[] nums = new int[num+1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i%2 == 0){
                nums[i] = nums[i/2];
            }else {
                nums[i] = nums[i/2] +1;
            }
        }
        return nums;
    }
}
