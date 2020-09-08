package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/7.
 */
public class convertToTitle {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n>0){
            int x = n%26;
            if(x ==0){
                sb.append('Z');
                n/=26;
                n-=1;
            }else {
                char c = (char) ('A' + x-1);
                sb.append(c);
                n/=26;
            }
        }

        return sb.reverse().toString();
    }

    //123
    //27 AA
    //26 A
}
