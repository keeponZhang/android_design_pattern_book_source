package zhushen.com.shejimoshi.leetcode;

/**
 * Created by Zhushen on 2018/11/23.
 */
public class sortList {
    //输入: 4->2->1->3
    //输出: 1->2->3->4
    public ListNode sortList(ListNode head) {
        ListNode root=new ListNode(0);
        root.next=head;
        ListNode p=head;
        while(p!=null&&p.next!=null){
            if(p.val<=p.next.val){p=p.next;}
            else{
                ListNode tmp=root,q=p.next;
                while(tmp.next.val<=q.val){
                    tmp=tmp.next;
                }
                p.next=q.next;
                q.next=tmp.next;
                tmp.next=q;
            }
        }
        return root.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
