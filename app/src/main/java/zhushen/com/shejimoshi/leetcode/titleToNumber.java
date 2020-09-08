package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class titleToNumber {
    public int titleToNumber(String s) {
        int result = 0;
        for (int i = 0; i <s.length() ; i++) {
            int x = s.charAt(i) - 'A' + 1;
            result*=26;
            result+=x;
        }
        return result;
    }
}
