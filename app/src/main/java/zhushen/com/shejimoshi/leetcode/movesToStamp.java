package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/11/7.
 */
public class movesToStamp {

    //stamp = "abc", target = "ababc"
    //输出：[0,2]

    //stamp = "aabcaca", target = "abca"
    //输出：[3,0,1]

    public static void main(String[] args){
        int[] result = movesToStamp("abca","aabcaca");
        int x = 0;
    }


    public static int[] movesToStamp(String stamp, String target) {
        int sl = stamp.length();
        char[] schs = stamp.toCharArray();

        // Time: O(S)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sl; i++) sb.append('?');
        String wildcards = sb.toString();		// "???..?" of stamp length

        List<Integer> resList = new ArrayList<>();
        int size = 0;
        int tl = target.length();
        String curr = target;
        boolean finished = false;
        // Time: O(T) * O(loop)
        while (!finished) {
            finished = true;
            // Time: O(T) * O(loop)
            next: for (int i = 0; i <= tl - sl; i++) {
                String str = curr.substring(i, i + sl);
                // Time: O(S)
                boolean empty = true;
                for (int j = 0; j < sl; j++) {
                    if (str.charAt(j) != '?') {
                        empty = false;
                        finished = false;
                        if (str.charAt(j) != schs[j]) continue next;
                    }
                }
                if (empty) continue;
                // match found "(stamp)" or "?*(part of stamp)?*"
                curr = curr.substring(0, i) + wildcards + curr.substring(i + sl);
                resList.add(i);
                break;
            }
            // no match pattern found
            if (!finished && size == resList.size()) return new int[0];
            size = resList.size();
        }

        // convert list into array
        int l = resList.size();
        int[] res = new int[l];
        for (int i = 0; i < l; i++) {
            res[i] = resList.get(l-1-i);
        }
        return res;
    }
}
