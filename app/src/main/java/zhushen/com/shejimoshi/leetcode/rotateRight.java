package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/1.
 */
public class rotateRight {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode p = head;
        ListNode last = new ListNode(-1);
        if (p == null) {
            return null;
        }
        int len = 0;
        while (p != null) {
            last = p;
            p = p.next;
            len++;
        }
        last.next = head;
        k %= len;
        k = len - k;
        p = head;
        while (k > 1) {
            p = p.next;
            k--;
        }

        last = p.next;
        p.next = null;
        return last;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
