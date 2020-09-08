package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/12/5.
 */
public class hasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null&&fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast)return true;
        }
        return false;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
