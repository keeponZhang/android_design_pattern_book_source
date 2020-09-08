package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/21.
 */
public class customSortString {
    public static void main(String[] args){
        String S = "cba";
        String T = "abcd";
        String result = customSortString(S,T);

        int x = 0;

    }


    public static String customSortString(String S, String T) {
        int[] temp = new int[26];
        for (int i = 0; i <S.length() ; i++) {
            temp[S.charAt(i) -'a'] = i+1;
        }


        for (int i = 0; i <T.length() ; i++) {

        }


        return S;



    }
}
