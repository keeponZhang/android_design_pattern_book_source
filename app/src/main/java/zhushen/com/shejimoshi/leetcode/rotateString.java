package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class rotateString {
    public static void main(String[] args){
        boolean result = rotateString("abcde","abced");
        int x = 0;
    }



    public static boolean rotateString(String A, String B) {
        if(A.equals(B)){
            return true;
        }

        int length = A.length();
        for(int i=1;i<length;i++){
            String str = A.substring(0,i);
            String[] strings = B.split(str);
            int x = 0;
            if(strings.length == 2){
                String B2 =str + strings[1] + strings[0] ;
                if(A.equals(B2)){
                    return true;
                }
            }
        }
        return false;
    }
}
