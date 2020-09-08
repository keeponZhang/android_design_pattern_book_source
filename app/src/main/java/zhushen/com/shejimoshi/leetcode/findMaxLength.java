package zhushen.com.shejimoshi.leetcode;

import java.util.HashMap;

/**
 * Created by Zhushen on 2018/11/30.
 */
public class findMaxLength {
    public int findMaxLength(int[] nums) {
        int ans = 0,sum = 0;
        for(int i=0;i<nums.length;i++)if(nums[i]==0)nums[i]=-1;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            if(sum == 0) {
                if(i >= ans)
                    ans = i+1;
            }
            if(map.get(sum) == null) {
                map.put(sum,i);
                continue;
            }
            int temp = i - map.get(sum);
            if(temp > ans) ans=temp;
        }
        return ans;
    }
}
