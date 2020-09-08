package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class jump {
    public int jump(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        int index,max = 0;
        int step = 0,i= 0;
        while(i < nums.length){
            //如果能直接一步走到最后，直接步数+1结束
            if(i + nums[i] >= nums.length - 1){
                step++;
                break;
            }
            max = 0;//每次都要初始化
            index = i+1;//记录索引，最少前进1步
            for(int j = i+1; j-i <= nums[i];j++){//搜索最大步长内行走最远的那步
                if(max < nums[j] + j-i){
                    max = nums[j] + j-i;//记录最大值
                    index = j;//记录最大值索引
                }
            }
            i = index;//直接走到能走最远的那步
            step++;//步长+1
        }
        return step;

    }
}
