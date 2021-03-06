package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/9/14.
 */
public class validPalindrome {
    public boolean validPalindrome(String s) {
        int i = -1, j = s.length();
        while (++i < --j){
            if (s.charAt(i) != s.charAt(j))
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);

        }
        return true;

    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }

}
