package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/8/15.
 */
public class characterReplacement {
    //s = "AABABBA", k = 1
    public int characterReplacement(String s, int k) {
        if (s.length() < 1) return 0;

        int start = 0;
        int end = 0;
        int res = 0;
        int[] charNum = new int[26];
        charNum[s.charAt(0) - 'A']++;
        while (s.length() > end) {
            int maxChar = 0;
            for (int i = 0; i < 26; i++) {
                if (charNum[i] > maxChar) maxChar = charNum[i];
            }

            if (maxChar + k > end - start) {
                end++;
                if (end < s.length()) charNum[s.charAt(end) - 'A']++;
            } else {
                charNum[s.charAt(start) - 'A']--;
                start++;
            }

            if (maxChar + k > res) res = maxChar + k <= s.length() ? maxChar + k : s.length();
        }
        return res;
    }
}
