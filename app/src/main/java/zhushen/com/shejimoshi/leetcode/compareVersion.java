package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/7.
 */
public class compareVersion {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("[.]");
        String[] arr2 = version2.split("[.]");
        int[] num1 = new int[arr1.length];
        int[] num2 = new int[arr2.length];

        for(int i = 0; i < arr1.length; i++) {
            num1[i] = Integer.parseInt(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++) {
            num2[i] = Integer.parseInt(arr2[i]);
        }
        for(int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            if(num1[i] > num2[i]) return 1;
            if(num1[i] < num2[i]) return -1;
            else continue;

        }
        if(arr1.length > arr2.length) {
            int sum = 0;
            for(int i = arr2.length; i < arr1.length; i++) {
                sum += num1[i];
            }
            if(sum == 0) return 0;
            else return 1;
        }

        if(arr1.length < arr2.length) {
            int sum = 0;
            for(int i = arr1.length; i < arr2.length; i++) {
                sum += num2[i];
            }
            if(sum == 0) return 0;
            else return -1;
        }
        return 0;
    }
}
