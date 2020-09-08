package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class maxCoins {
    public static void main(String[] args){

    }

    public int maxCoins(int[] nums) {
        //3 1 5 8
        int[] dpnums = new int[nums.length+2];
        dpnums[0] = 1;
        dpnums[dpnums.length-1] = 1;
        System.arraycopy(nums, 0, dpnums, 1, nums.length);

        int[][] coins = new int[dpnums.length][dpnums.length];
        for(int i=2; i<dpnums.length; i++) {
            for(int j=i-2; j>=0; j--) {
                for(int k=i-1; k>j; k--) {
                    coins[j][i] = Math.max(coins[j][i], coins[j][k] + dpnums[j] * dpnums[k] * dpnums[i] + coins[k][i]);
                }
            }
        }
        return coins[0][dpnums.length-1];
    }
}
