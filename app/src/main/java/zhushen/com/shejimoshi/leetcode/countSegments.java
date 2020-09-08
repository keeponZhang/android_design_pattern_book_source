package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/7/23.
 */
public class countSegments {
    public static void main(String[] args){
        int result = countSegments("Of all the gin joints in all the towns in all the world, ");
        int x = 0;
    }

    public static int countSegments(String s) {
        s = s.trim();
        if(s.equals("")||s.trim().length()==0){
            return 0;
        }

        char[] chars = s.toCharArray();
        int res = 1;
        char temp = ' ';
        for (char c:chars) {
            if(c == ' '&&temp!= ' '){
                res++;
            }
            temp = c;
        }
//        String[] strings = s.split(" ");
        return res;
    }
}
