package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/29.
 */
public class canPlaceFlowers {
    public static void main(String[] args){
        int[] nums = new int[]{1,0,0,0,1,0,0};
        boolean result = canPlaceFlowers(nums,2);
        int x = 0;
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int result = 0;
        int temp = 0;
        if(flowerbed[0] == 0){
            temp++;
        }
        for (int i = 0; i <flowerbed.length ; i++) {

            if(flowerbed[i] ==1){
                result += (temp-1)/2;
                temp = 0;
            }else {
                temp++;
            }
            if(i == flowerbed.length -1 && flowerbed[i] == 0){
                temp++;
                result += (temp-1)/2;
            }
        }


        return result>=n;
    }
}
