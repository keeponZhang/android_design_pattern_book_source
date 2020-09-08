package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/11/21.
 */
public class reorderList {
    //给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
    //将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
    public void reorderList(ListNode head) {
        // 链表有效性判断
        if (head == null || head.next == null){
            return;
        }
        // 建立一个堆栈,将链表中的每一个节点压入堆栈
        Stack<ListNode> stack = new Stack<>();
        ListNode index = head;
        while (index!= null) {
            stack.push(index);
            index = index.next;
        }
        int length = stack.size();
        ListNode index2 = head;
        int num = 1;
    /*
    重组链表
    首先将顺序列表的下一个节点取出,定义为临时节点
    然后从堆栈顶取出顶层的节点,由于先进后出的原则,取出的节点顺序为从后至前
    再将Head与堆栈中取出的节点相连,再与临时节点相连
     */
        while (num<length){
            ListNode next = index2.next;
            index2.next = stack.pop();
            index2 = index2.next;
            num++;
            // 如果有偶数个元素,则从这里结束
            while (num>=length) {
                break;
            }
            index2.next = next;
            index2 = index2.next;
            num++;
        }
        // 对节点尾部添加null,形成链表
        index2.next = null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
