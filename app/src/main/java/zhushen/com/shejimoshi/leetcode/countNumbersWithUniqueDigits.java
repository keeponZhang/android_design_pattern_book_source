package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class countNumbersWithUniqueDigits {
    public static void main(){
        //1
        //2 91 9*1 + 10*9 0-9 10-99
        //3 0-999
    }


    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0){
            return 1;
        }
        int result = 10;
        int count = 9;
        for (int i = 1; i < n;i++){
            result += count*(10 - i);
            count *= (10 - i);
        }
        return result;

    }
}
