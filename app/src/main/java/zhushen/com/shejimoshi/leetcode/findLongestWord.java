package zhushen.com.shejimoshi.leetcode;

import java.util.List;

/**
 * Created by Zhushen on 2018/9/11.
 */
public class findLongestWord {
    public String findLongestWord(String s, List<String> d) {
        String ret = "";
        for (String str : d) {
            for (int i = 0, j = 0; i < s.length() && j < str.length(); i++) {
                if (s.charAt(i) == str.charAt(j)) j++;
                if (j == str.length()) {
                    if (ret.length() < str.length()
                            || (ret.length() == str.length() && ret.compareTo(str) > 0)) {
                        ret = str;
                    }
                }
            }
        }
        return ret;
    }
}
