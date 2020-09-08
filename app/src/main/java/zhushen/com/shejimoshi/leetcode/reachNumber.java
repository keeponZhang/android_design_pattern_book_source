package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class reachNumber {
    public static void main(String[] args){
        int x = reachNumber(100);
        int y = 0;
    }

    public static int reachNumber(int target) {
        //1-2-3 -4
        target = Math.abs(target);
        int i =0;
        while(i*(i+1)<2*target) {
            i++;
        }
        if(i*(i+1)==2*target){
            return i ;
        } else {
            if((i*(i+1)/2-target)%2==0){
                return i;
            } else {
                if(i%2==0) {
                    return i+1 ;
                } else
                    return i+2 ;
            }

        }
    }
}
