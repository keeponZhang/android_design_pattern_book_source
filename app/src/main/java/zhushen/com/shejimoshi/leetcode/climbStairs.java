package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class climbStairs {
    public static void main(String[] args){

    }


    public int climbStairs(int n) {
        if(n ==1){
            return 1;
        }else if(n ==2){
            return 2;
        }else {
            return climbStairs(1) + climbStairs(2);
        }

    }
}
