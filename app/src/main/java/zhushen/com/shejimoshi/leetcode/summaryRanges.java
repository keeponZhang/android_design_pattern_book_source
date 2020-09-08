package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/9/10.
 */
public class summaryRanges {

    public static void main(String[] args){
        int num = Integer.MIN_VALUE;
        int[] nums = new int[]{-2147483648,-2147483647,2147483647};
        List<String> list = summaryRanges(nums);
        int x = 0;
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0){
            return list;
        }
        int temp = nums[0];
        int count = 0;
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i]>count+1 +temp ){
                //todo temp-nums[i-1]
                list.add(create(temp,temp+count));

                temp = nums[i];
                count = 0;
            }

            if(nums[i] - nums[i-1] == 1){
                count ++ ;
            }
        }
        list.add(create(temp,temp+count));
        return list;

    }

    private static String create(int start,int end){
        if(end -start  == 0){
            return start+"";
        }
        return start + "->" + end;
    }
}
