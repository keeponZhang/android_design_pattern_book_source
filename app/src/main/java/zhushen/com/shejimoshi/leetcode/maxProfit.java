package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class maxProfit {
    public static void main(String[] args){
        int[] nums = new int[]{7,1,5,3,6,4};
        int result =maxProfit(nums);
        int x = 0;
    }

    public static int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int[] nums = new int[prices.length];
        nums[0] = 0;
        for (int i = 1; i <prices.length ; i++) {
            nums[i] = prices[i] - prices[i-1];
        }
        return findMaxSubarray(nums,0,nums.length-1);
    }

    public int maxProfit(int[] prices, int fee) {
        return 0;
    }

    public static int findMaxSubarray(int[] A,int low,int high){
        if(low == high)
            return Math.max(A[low],0);
        else{
            int mid = low + (high - low)/2;// 防止越界
            int leftSum = findMaxSubarray(A,low,mid);//(1)
            int rightSum = findMaxSubarray(A,mid+1,high);//(2)
            int midSum = findMaxCrossingSubarray(A,low,mid,high);//(3)
            int sum = Math.max(leftSum,rightSum);
            sum = Math.max(sum,midSum);
            sum = Math.max(sum,0);
            return sum;
        }
    }

    public static int findMaxCrossingSubarray(int[] A,int low,int mid,int high){
        if(low > mid || mid>high)
            return Integer.MIN_VALUE;
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxleft = -1;
        int maxright = -1;
        for(int i = mid;i>=low;i--){
            sum+=A[i];
            if( sum >= leftSum){// 向左只要和增加就更新
                leftSum = sum;
                maxleft = i;
            }
        }
        sum = 0;
        for(int j = mid+1;j<=high;j++){
            sum+=A[j];
            if(sum>=rightSum){
                rightSum = sum;
                maxright = j;
            }
        }
        return leftSum + rightSum;
    }
}
