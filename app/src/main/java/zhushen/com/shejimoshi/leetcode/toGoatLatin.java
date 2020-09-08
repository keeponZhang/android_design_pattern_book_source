package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/10/12.
 */
public class toGoatLatin {
    public static void main(String[] args){
        String str = "I speak Goat Latin";
        String result = toGoatLatin(str);
        int x = 0;
    }

    public static String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if(i!=0){
                sb.append(" ");
            }
            char[] froms = strings[i].toCharArray();
            if(froms[0] == 'a'||froms[0] == 'e'||froms[0] == 'i'||froms[0] == 'o'||froms[0] == 'u'||
                    froms[0] == 'A'||froms[0] == 'E'||froms[0] == 'I'||froms[0] == 'O'||froms[0] == 'U'){
                sb.append(strings[i]);
            }else {
                // TODO: 2018/10/12 zuoyi
                for (int j = 1; j <froms.length ; j++) {
                    sb.append(froms[j]);
                }
                sb.append(froms[0]);
            }
            sb.append("ma");

            for (int j = 0; j <=i ; j++) {
                sb.append("a");
            }
        }
        return sb.toString();
    }
}
