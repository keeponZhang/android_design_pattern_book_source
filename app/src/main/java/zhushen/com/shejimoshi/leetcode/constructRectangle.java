package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/24.
 */
public class constructRectangle {
    public static void main(String[] args){
        int[] result = constructRectangle(4);
        int x = 0;
    }

    public static int[] constructRectangle(int area) {
        int L =1;
        int W = 1;
        for (int i = 1; i <=Math.sqrt(area) ; i++) {
            if(area%i == 0){
                L = area/i;
                W = i;
            }
        }
        return new int[]{L,W};
    }
}
