package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class hasAlternatingBits {
    public static void main(String[] args){
        boolean res = hasAlternatingBits(5);
        int x = 0;

    }


    public static boolean hasAlternatingBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        if(n%2 ==1){
            sb.append("0");
        }
        String[] strings = sb.toString().split("10");
        if(strings.length>0){
            return false;
        }

        return true;
    }
}
