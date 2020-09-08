package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/2.
 */
public class partitionDisjoint {
    //5,0,3,8,6
    //503 86

    //1,1,1,0,6,12
    //1110 612

    public static void main(String[] args){
        int[] nums = new int[]{6,0,8,30,37,6,75,98,39,90,63,74,52,92,64};
        int result = partitionDisjoint(nums);
        int x = 0;
    }

    public static int partitionDisjoint(int[] A) {
        int[] max = new int[A.length];
        int[] min = new int[A.length];
        max[0] = A[0];
        min[A.length-1] = A[A.length -1];
        for (int i = 1; i <A.length ; i++) {
            max[i] = Math.max(max[i-1],A[i]);
            min[A.length-1-i] = Math.min(min[A.length-i],A[A.length-1-i]);
        }

        for (int i = 1; i < A.length; i++) {
            if(max[i-1]<=min[i]){
                return i;
            }
        }

        return A.length-1;


    }
}
