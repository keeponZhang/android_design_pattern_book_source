package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/26.
 */
public class canCross {
    public static void main(String[] args){
        int[] stones = new int[]{0,1,3,5,6,8,12,17};
        boolean result = canCross(stones);
        int x = 0;

    }

    public static boolean canCross(int[] stones) {
        int temp = 1;
        if(stones[1] - stones[0] != temp){
            return false;
        }
        for (int i = 2; i < stones.length; i++) {
            int value = stones[i] - stones[i-1];
            value = value - temp;
            if(value<2&&value>-2){
                temp = value + temp;
            }else {
                return false;
            }

        }
        return true;
    }
}
