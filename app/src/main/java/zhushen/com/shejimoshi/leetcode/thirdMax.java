package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class thirdMax {
    public static void main(String[] args){

    }


    public int thirdMax(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[0];
        result[1] = nums[1];
        result[2] = nums[2];

        for (int number:nums) {
            if(result[0]<number){
                result[0] = number;
            }else if(result[1]<number){
                result[1] = number;
            }else if(result[2]<number){
                result[2] = number;
            }
        }

        return 0;

    }
}
