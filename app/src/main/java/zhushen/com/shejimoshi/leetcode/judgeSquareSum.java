package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class judgeSquareSum {
    public static void main(String[] args){

    }

    public boolean judgeSquareSum(int c) {
        int x = (int) Math.sqrt(c);
        for(int i=0;i<=x;i++){
            int tem = i*i + x*x;
            if(tem == c){
                return true;
            }else if(tem>c){
                x--;
            }
        }
        return false;
    }


    public boolean isPerfectSquare(int num) {
        for(int i = 1; num > 0; i += 2){
            num -= i;
        }
        return num == 0;
    }
}
