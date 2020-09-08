package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/20.
 */
public class convertToBase7 {
    public static void main(String[] args){
        String result = convertToBase7(100);
        int x = 0;
    }

    public static String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }

        if(num<0){
            return "-"  + convertToBase7(-num);
        }

        if(num/7 == 0){
            return num%7 + "";
        }
        return convertToBase7(num/7) + num%7;

    }

}
