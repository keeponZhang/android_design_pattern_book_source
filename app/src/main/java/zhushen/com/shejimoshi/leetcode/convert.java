package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/23.
 */
public class convert {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;

        StringBuffer[] sb = new StringBuffer[numRows];  //存储每一行的值
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuffer();
        }

        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);
            for (int idx = numRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }

        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);
        return sb[0].toString();
    }
}
