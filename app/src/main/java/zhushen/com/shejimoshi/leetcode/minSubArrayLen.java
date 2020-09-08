package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/25.
 */
public class minSubArrayLen {

    public static void main(String[] args){

    }

    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int j =-1;
        int total = 0;
        int res=nums.length+1;
        while(i<nums.length){
            if(j+1<nums.length&&total<s){
                j+=1;
                total+=nums[j];
            }else{
                total-=nums[i];
                i++;
            }
            if (total >= s)
                res = Math.min(res, j-i+1);
        }
        if(res == nums.length+1)
            return 0;
        return res;
    }
}
