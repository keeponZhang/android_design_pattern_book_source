package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/9/25.
 */
public class numFriendRequests {
    public  static void  main(String[] args){
        int[] nums = new int[]{16,17,18};
        int result = numFriendRequests(nums);
        int x = 0;
    }

    /**
     * age[B] <= 0.5 * age[A] + 7
     * age[B] > age[A]
     * age[B] > 100 && age[A] < 100
     * @param ages
     * @return
     */

    public static int numFriendRequests(int[] ages) {
        // 映射数组
        int nums[] = new int[121],sums[] = new int[121],res = 0;
        //计算各个年龄段的人数
        for( int i = 0;i < ages.length;i++) {
            nums[ages[i]]++;
        }
        //计算年龄小于等于下标人数
        for(int i = 1;i<121;i++) {
            sums[i] = sums[i-1] + nums[i];
        }
        //低于15没朋友
        for(int i = 15;i < 121;i++) {
            if(nums[i] == 0) continue;
            int count = sums[i] - sums[i/2+7];
            //不包含自己
            count--;
            res += count * nums[i];
        }
        return res;
    }
}
