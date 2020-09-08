package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/9/12.
 */
public class validSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int l1 = (p1[0] - p2[0])*(p1[0] - p2[0]) + (p1[1] - p2[1])*(p1[1] - p2[1]);
        int l2 = (p1[0] - p3[0])*(p1[0] - p3[0]) + (p1[1] - p3[1])*(p1[1] - p3[1]);
        int l3 = (p1[0] - p4[0])*(p1[0] - p4[0]) + (p1[1] - p4[1])*(p1[1] - p4[1]);
        int l4 = (p2[0] - p3[0])*(p2[0] - p3[0]) + (p2[1] - p3[1])*(p2[1] - p3[1]);
        int l5 = (p2[0] - p4[0])*(p2[0] - p4[0]) + (p2[1] - p4[1])*(p2[1] - p4[1]);
        int l6 = (p3[0] - p4[0])*(p3[0] - p4[0]) + (p3[1] - p4[1])*(p3[1] - p4[1]);

        int[] nums = new int[]{l1,l2,l3,l4,l5,l6};


        Arrays.sort(nums);
        if(nums[0] == 0 ){
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if(nums[0]!= nums[i]){
                return false;
            }
        }
        for (int i = 4; i <6 ; i++) {
            if(nums[i]/nums[0]!=2){
                return false;
            }
        }
        return true;
    }
}
