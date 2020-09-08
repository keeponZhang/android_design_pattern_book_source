package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class isPowerOfFour {
    public static void  main(String[] args){
        boolean result =  isPowerOfFour(5);
        int x = 0;

    }

    private static boolean isPowerOfFour(int num){
        if(num<4){
            return false;
        }
        if(num ==4){
            return true;
        }
        if(num%4 !=0){
            return false;
        }
        return isPowerOfFour(num/4);
    }
}
