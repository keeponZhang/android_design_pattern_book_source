package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/7/30.
 */
public class buddyStrings {
    public static void main(String[] args){
        boolean result = buddyStrings("aa","aa");
        int x = 0;
    }

    public static boolean buddyStrings(String A, String B) {
        if(A.equals(B)){
            return findRepeatChar(A);
        }
        if(A.length() != B.length()){
            return false;
        }
        char[][] temp = new char[2][2];
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            char a = A.charAt(i);
            char b = B.charAt(i);
            if(a != b){
                if(count == 2){
                    return false;
                }
                temp[count][0] = a;
                temp[count][1] = b;
                count ++;
            }
        }
        if(count == 1){
            return false;
        }
        if(temp[0][0] == temp[1][1]&&temp[0][1] == temp[1][0]){
            return true;
        }
        return false;
    }

    private static boolean findRepeatChar(String a) {
        Set<Character>  set = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            if(!set.contains(a.charAt(i))){
                set.add(a.charAt(i));
            }else {
                return true;
            }
        }
        return false;
    }
}
