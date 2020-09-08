package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/16.
 */
public class numJewelsInStones {
    public static void main(String[] args){

    }


    public int numJewelsInStones(String J, String S) {
        Set<String> set = new HashSet<>();
        int length = J.length();
        for(int i=0;i<length;i++){
            String s = J.substring(i,i+1);
            if(!set.contains(s)){
                set.add(s);
            }
        }

        int count = 0;
        length = S.length();
        for(int i=0;i<length;i++){
            String s = S.substring(i,i+1);
            if(set.contains(s)){
                count ++;
            }
        }

        return count;
    }
}
