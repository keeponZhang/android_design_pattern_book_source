package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/30.
 */
public class fairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0,sumB = 0;
        for (int num:A) {
            sumA += num;
        }
        for (int num:B) {
            sumB += num;
        }

        int temp =  (sumA - sumB)/2;
        for (int numA:A) {
            for (int numB:B) {
                if(numA - numB == temp){
                    return new int[]{numA,numB};
                }
            }
        }
        return new int[]{0,0};


    }
}
