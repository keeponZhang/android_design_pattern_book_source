package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/10.
 */
public class isOneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int i;
        for( i=0;i<len-1;i++){
            if(bits[i]==1){
                i += 1;
            }
        }
        return i==len-1;
    }
}
