package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class isPowerOfTwo {

    public static void main(String[] args){

    }

    public boolean isPowerOfTwo(int n) {
        if(n <1){
            return false;
        }
        if(n ==1){
            return true;
        }
        if(n%2 ==0){
            return isPowerOfTwo(n/2);
        }
        return false;

    }
}
