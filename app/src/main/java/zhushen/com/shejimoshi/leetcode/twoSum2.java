package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/27.
 */
public class twoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length -1;
        int sum;

        while (i<j){
            sum = numbers[i] + numbers[j];
            if(sum == target){
                return new int[]{i+1,j+1};
            }else if(sum>target){
                j--;
            }else {
                i++;
            }
        }

        return new int[]{i+1,j+1};
    }
}
