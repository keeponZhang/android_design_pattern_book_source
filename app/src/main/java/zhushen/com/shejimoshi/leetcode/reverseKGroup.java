package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/30.
 */
public class reverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans = new ListNode(Integer.MAX_VALUE);
        ans.next = head;
        ListNode p = ans;
        while (ok(p.next, k)) {
            p = reverse(p, k);
        }
        return ans.next;
    }

    private boolean ok(ListNode p, int k) {
        while (k > 0 && p != null) {
            p = p.next;
            k--;
        }
        return k == 0;
    }

    private ListNode reverse(ListNode front, int k) {
        ListNode from = front.next;
        ListNode head = from;
        ListNode cur = from.next;
        ListNode tmp = null;
        while (k > 1 && cur != null) {
            tmp = cur.next;
            cur.next = from;

            from = cur;
            cur = tmp;
            k--;
        }
        head.next = cur;
        front.next = from;
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
