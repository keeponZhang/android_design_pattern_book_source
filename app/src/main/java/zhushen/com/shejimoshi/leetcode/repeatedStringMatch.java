package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class repeatedStringMatch {
    public static void main(String[] args){
        int result = repeatedStringMatch("11","111");
        int x = 0;
    }

    //1234
    //34123412

    public static int repeatedStringMatch(String A, String B) {
        if(!(B+B).contains(A)){
            return -1;
        }

        int num = 0;
        String str = A;



        return 0;

    }
}
