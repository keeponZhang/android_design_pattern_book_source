package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/13.
 */
public class consecutiveNumbersSum {
    public int consecutiveNumbersSum(int N) {
        int ans = 1;
        int x = 2 * N;
        int index = (int)Math.sqrt(x);
        for(int i = 2;i <= index;i++){
            if(x % i == 0){
                double n2 = (i + x/i - 1)/2;
                double n1 = x / i - n2;
                if(n1 < n2 && (int)n1 == n1 && (int)n2 == n2)
                    if ((n1 + n2) * (n2 - n1 + 1) == x)
                        ans++;
            }
        }
        return ans;

    }
}
