package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/17.
 */
public class reverseWords  {
    public static void main(String[] args){
        String str = "   a   b  c d   e  ";
        String result =  reverseWords2(str);
        int x = 0;
    }

    public static String reverseWords(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str:strings) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.reverse();
            sb.append(stringBuilder);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static String reverseWords2(String s){
        s = s.trim();
        String[] strings = s.split(" +");
        if(strings.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str:strings) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.reverse();
            sb.append(stringBuilder);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.reverse().toString();

    }
}
