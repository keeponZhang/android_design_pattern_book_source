package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class maxArea {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (right>left){
            int value = (right - left) *(height[right]>height[left]?height[left]:height[right]);
            max = max<value?value:max;
            if(height[left]<height[right]){
                left ++;
            }else {
                right --;
            }
        }

        return max;
    }
}
