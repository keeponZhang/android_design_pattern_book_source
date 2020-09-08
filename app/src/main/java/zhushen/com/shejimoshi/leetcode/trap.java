package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/12.
 */
public class trap {

    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];

        int max = 0;
        for (int i = 0; i <height.length ; i++) {
            max = Math.max(max,height[i]);
            left[i] = max;
        }
        max = 0;
        for (int i = height.length  -1; i >=0; i--) {
            max = Math.max(height[i],max);
            right[i] = max;
        }

        int result = 0;
        for (int i = 0; i <height.length ; i++) {
            max = Math.min(left[i],right[i]);
            result += max>height[i]?max-height[i]:0;
        }
        return result;

    }
}
