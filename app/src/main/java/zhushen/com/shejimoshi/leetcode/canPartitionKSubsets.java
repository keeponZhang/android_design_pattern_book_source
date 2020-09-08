package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class canPartitionKSubsets {
    public static void main(String[] args){

    }

    //1, 5, 11, 5
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        if ((sum & 1) == 1) return false;
        sum >>= 1;
        Arrays.sort(nums); //排序以便去重
        return dfs(nums, 0, sum);
    }

    private boolean dfs(int[] nums, int i, int target) {
        if (target == 0) return true;
        if (i > nums.length || target < 0) return false;
        boolean mark = false; //相当于第40题的list，即把路径存储在这里
        for (int p = i; p < nums.length; p++) {
            int newSum = target - nums[p]; //添加到路径
            mark = mark || dfs(nums, p+1, newSum); //mark本身相当于回溯，并和搜索下一个节点的结果相结合
            while (p < nums.length - 1 && nums[p] == nums[p+1]) p++; //去重，利用排序特点
        }
        return mark;
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(k ==1){
            return true;
        }

        int sum = 0;
        for (int num:nums) {
            sum += num;
        }
        if(sum%k!=0){
            return false;
        }

        Arrays.sort(nums);
        int target = sum/k;
        if(nums[nums.length-1]>target){
            return false;
        }

        for (int i = 0; i < k; i++) {
            
        }

        return false;
    }

}
