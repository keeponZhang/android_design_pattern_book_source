package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/10.
 */
public class circularArrayLoop {
    public static void main(String[] args){
        int[] nums = new int[]{2, -1, 1, 2, 2};
        boolean result = circularArrayLoop(nums);
        int x = 0;
    }

    public static boolean circularArrayLoop(int[] nums) {boolean retBoolean = false;
        for(int i=0; i<nums.length; i++){
            int j = i,k=getNextIndex(nums,i);
            while (nums[i] * nums[j] > 0 && nums[i]*nums[k] > 0 && nums[i] * nums[getNextIndex(nums,k)]>0){
                if(j==k){
                    if(j==getNextIndex(nums,j)){
                        break;
                    }
                    return true;
                }
                j = getNextIndex(nums,j);
                k = getNextIndex(nums,getNextIndex(nums,k));
            }
        }
        return retBoolean;
    }

    private static int getNextIndex(int[] nums, int i){
        int length = nums.length;
        int nextPosition = i + nums[i];
        return nextPosition >= 0 ? nextPosition%length:length + (nextPosition%length);
    }
}
