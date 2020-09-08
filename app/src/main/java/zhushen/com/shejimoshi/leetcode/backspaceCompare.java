package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/31.
 */
public class backspaceCompare {
    public static void main(String[] args){
        boolean result = backspaceCompare("ab#c", "ad#c");
        int x = 0;
    }

    public static boolean backspaceCompare(String S, String T) {
        if(T.equals(S)){
            return true;
        }

        S = deleteStart(S);
        T = deleteStart(T);

        return translate(S).equals(translate(T));
    }

    private static String deleteStart(String str){
        if(str.startsWith("#")){
            str = str.substring(1);
            deleteStart(str);
        }
        return str;
    }

    private static String translate(String S){
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            String str = S.substring(i,i+1);
            if(str.equals("#")){
                if(sb1.length()>1){
                    sb1.deleteCharAt(sb1.length()-1);
                }
            }else {
                sb1.append(str);
            }
        }
        return sb1.toString();
    }
}
