package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class isUgly {
    public static void main(String[] args){

    }


    public boolean isUgly(int num) {
        if(num ==0){
            return true;
        }
        if(num == -1){
            return false;
        }
        if(num ==1){
            return true;
        }
        if(num%2==0){
            return isUgly(num/2);
        }
        if(num%23==0){
            return isUgly(num/3);
        }
        if(num%5==0){
            return isUgly(num/5);
        }
        return false;
    }
}
