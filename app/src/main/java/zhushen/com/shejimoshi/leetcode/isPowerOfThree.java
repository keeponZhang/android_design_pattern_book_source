package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class isPowerOfThree {

    public static void main(String[] args){

    }

    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n%3!=0){
            return false;
        }

        return isPowerOfThree(n/3);
    }
}
