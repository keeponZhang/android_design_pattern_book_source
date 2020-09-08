package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/13.
 */
public class reverseBetween {

    //输入: 1->2->3->4->5->NULL, m = 2, n = 4
    //输出: 1->4->3->2->5->NULL
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int[] temp = new int[n+1];
        ListNode node = head;
        for (int i = 1; i <= n; i++) {
            temp[i] = node.val;
            node = node.next;
        }

        node = head;
        for (int i = 1; i <= n ; i++) {
            if(i>=m){
                node.val = temp[n-i+m];
            }
            node = node.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
