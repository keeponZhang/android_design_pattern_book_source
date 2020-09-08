package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class guessNumber {
    public static void main(String[] args){
        int result = guessNumber(10);
        int i = 0;
    }

    public static int guessNumber(int n) {int low=1,high=n;
        while(low<=high) {
            int mid=(high-low)/2+low;
            int g=guess(mid);
            if(g==1)//中间数比目标数小
                low=mid+1;
            else if(g==-1)//中间数比目标数大
                high=mid-1;
            else return mid;
        }
        return -1;
    }

    private static int myguess(int start, int end) {
        int middle = start + (end - start)/2;
        if(middle == start){
            middle = end;
        }

        if(guess(middle)>0){
            return myguess(start,middle);
        }else if(guess(middle)<0){
            return myguess(middle,end);
        }
        return middle;
    }

    private static int guess(int num){
        int number = 5;
        if(num>number){
            return 1;
        }else if(num == number){
            return 0;
        }
        return -1;
    }
}
