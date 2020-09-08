package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class checkPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if(num%i == 0){
                sum += i;
                sum += num/i;
            }
        }

        return sum == num;
    }
}
