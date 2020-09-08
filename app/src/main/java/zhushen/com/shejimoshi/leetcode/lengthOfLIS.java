package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/15.
 */
public class lengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] tmpArr = new int[nums.length];
        tmpArr[0] = nums[0];
        int tmpLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > tmpArr[tmpLen - 1]) {
                tmpArr[tmpLen] = nums[i];
                tmpLen++;
            } else {
                //二分查找。注意，这里二分查找是求下界的，即返回 >= 所查找对象的第一个位置
                int mid;
                int left = 0;
                int right = tmpLen - 1;
                while (left<right) {
                    mid = (left + right) / 2;
                    if (tmpArr[mid]>=nums[i]) right=mid;
                    else left = mid + 1;
                }
                tmpArr[left] = nums[i];
            }
        }
        return tmpLen;
    }
}
