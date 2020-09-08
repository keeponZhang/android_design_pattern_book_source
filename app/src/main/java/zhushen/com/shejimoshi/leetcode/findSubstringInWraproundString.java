package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/7.
 */
public class findSubstringInWraproundString {
    public int findSubstringInWraproundString(String p) {
        int[] pint = new int[p.length()];
        int[] count = new int[26];

        for (int i = 0; i < p.length(); i++)
            pint[i] = p.charAt(i)-'a';

        int re = 0;
        int max = 0;
        for (int i = 0; i < pint.length; i++) {
            if (i > 0 && ((pint[i] - pint[i-1]) == 1 || pint[i] == 0 && pint[i-1] == 25))
                max ++;
            else max = 1;
            count[pint[i]] = max;
        }

        for (int i = 0; i < 26; i++)
            re += count[i];

        return re;
    }
}
