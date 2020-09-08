package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/18.
 */
public class lemonadeChange {

    public static void main(String[] args){
        int[] bill = new int[]{10,10};
        boolean result = lemonadeChange(bill);
        int x = 0;
    }

    public static boolean lemonadeChange(int[] bills) {
        int bill5 =0;
        int bill10 = 0;

        for (int num:bills) {
            if(num == 5){
                bill5++;
            }
            if(num == 10){
                bill5--;
                bill10++;
            }
            if(num == 20){
                if(bill10 == 0){
                    bill5 -=3;
                }else {
                    bill10--;
                    bill5--;
                }
            }
            if(bill5<0||bill10<0){
                return false;
            }
        }
        return true;
    }

}
