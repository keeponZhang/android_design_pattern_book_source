package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/14.
 */
public class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode h = new ListNode(0);
        ListNode p = h;

        while (head!=null){
            if(head.val!=val){
                p.next = head;
                p = p.next;
            }

            if(head.next != null){
                head = head.next;
            }else {
                break;
            }
        }

        if(p.next!=null){
            p.next = null;
        }

        if(h.next ==null){
            return null;
        }else {
            h = h.next;
            return h;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
