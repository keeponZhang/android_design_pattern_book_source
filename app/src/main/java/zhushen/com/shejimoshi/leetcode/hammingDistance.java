package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/10.
 */
public class hammingDistance {
    public static void main(String[] args){
         int result = hammingDistance(1,4);
         int x = 0;
    }

    public static int hammingDistance(int x, int y) {
        int temp = x^y;
        int count = 0;
        while (temp>0){
            if(temp%2 == 1){
                count ++;
            }
            temp/=2;
        }
        return count;
    }


    public int totalHammingDistance(int[] nums) {
        int size = nums.length;
        int count = 0;
        int result = 0;

        for (int i = 0; i < 32; i++) {
            count = 0;
            for (int j = 0; j <size ; j++) {
                count+=nums[j]&1 ;
                nums[j]>>=1;

            }
            result += count*(size -count);
        }

        return result;
    }
}
