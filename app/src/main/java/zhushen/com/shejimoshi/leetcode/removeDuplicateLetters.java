package zhushen.com.shejimoshi.leetcode;

import java.util.Arrays;

/**
 * Created by Zhushen on 2018/8/27.
 */
public class removeDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        char[] sa = s.toCharArray();
        int[] alphabet = new int[26];
        int count = 0;
        for(int i=0; i<sa.length; i++) {
            if (alphabet[sa[i]-'a']==0) count ++;
            alphabet[sa[i]-'a'] ++;
        }
        char[] removed = new char[count];
        int left = 0;
        int right = sa.length;
        int c = 0;
        Arrays.fill(alphabet, 0);
        while (c<count) {
            right --;
            if (alphabet[sa[right]-'a']==0) c ++;
            alphabet[sa[right]-'a'] ++;
        }
        for(int i=0; i<count; i++) {
            char ch = sa[right];
            int leftmost=right;
            for(int j=right-1; j>=left; j--) {
                if (sa[j] <= ch && alphabet[sa[j]-'a'] != 0) {
                    ch = sa[j];
                    leftmost = j;
                }
            }
            alphabet[ch-'a'] = 0;
            removed[i] = ch;
            left = leftmost + 1;
            while (right<sa.length-1 && alphabet[sa[right]-'a'] != 1) {
                if (alphabet[sa[right]-'a'] > 1) alphabet[sa[right]-'a'] --;
                right ++;
            }
        }
        return new String(removed);

    }
}
