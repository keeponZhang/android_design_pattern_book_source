package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class maxProfit2 {

    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int sum =0;
        for (int i = 1; i < prices.length; i++) {
            int value = prices[i] - prices[i-1];
            sum += value>0?value:0;
        }

        return sum;
    }


    public int maxProfit2(int[] prices) {

        if(prices.length<2)
            return 0;


        return 0;

    }
}
