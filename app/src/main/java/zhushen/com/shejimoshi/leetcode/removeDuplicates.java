package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/10.
 */
public class removeDuplicates {
    //1,1,1,2,2,3
    //1,1,2,2,3
    public int removeDuplicates(int[] nums) {
        int repeat=2;
        if(nums.length<=repeat)return nums.length;

        int len2=1;
        int cnt=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[len2-1]){
                cnt=1;nums[len2++]=nums[i];
            }
            else{
                cnt++;
                if(cnt>repeat){
                    continue;
                }
                else{
                    nums[len2++]=nums[i];
                }
            }
        }
        return len2;
    }
}
