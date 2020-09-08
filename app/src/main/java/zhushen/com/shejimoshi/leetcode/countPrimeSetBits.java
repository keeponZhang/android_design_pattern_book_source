package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class countPrimeSetBits {
    public static void main(String[] args){
        int result = countPrimeSetBits(10,15);
        int x = 0;
    }


    public static int countPrimeSetBits(int L, int R) {
        int count = 0;

        for(int i = L;i<=R;i++){
            if(isPrime(count(i))){
                count++;
            }
        }

        return count;
    }

    private static int count(int n){
        if(n<2){
            return n;
        }
        return count(n/2) + n%2;
    }

    private static boolean isPrime(int count) {
        if (count == 2 || count == 3 || count == 5 || count == 7 || count == 11 || count == 13 || count == 17 || count == 19)
            return true;
        return false;
    }

}
