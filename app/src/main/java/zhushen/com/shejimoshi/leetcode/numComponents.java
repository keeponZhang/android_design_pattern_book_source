package zhushen.com.shejimoshi.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Zhushen on 2018/12/5.
 */
public class numComponents {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> setG = new HashSet<>();

        for (int i : G) setG.add(i);

        int res = 0;
        while (head != null) {
            if (setG.contains(head.val) && (head.next == null || !setG.contains(head.next.val))) res++;
            head = head.next;
        }

        return res;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
