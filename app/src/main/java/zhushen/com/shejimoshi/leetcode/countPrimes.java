package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/13.
 */
public class countPrimes {
    public static void main(String[] args){
        int resutl = countPrimes(10);
        int i = 0;

    }

    public static int countPrimes(int n) {
        if(n == 0)
            return 0;
        boolean[] array = new boolean[n];
        for (int i = 0;i < n;i++)
            array[i] = true;

        array[0] = false;
        int count = 0;
        int limit = (int) Math.sqrt(n);

        for(int i = 2; i <= limit; i++) {
            if (array[i-1]) {
                for (int j = i*i; j < n; j += i) {
                    array[j - 1] = false;
                }
            }
        }
        for (int j = 2; j < n; ++j) {
            if (array[j]) ++count;
        }
        return count;
    }
}
