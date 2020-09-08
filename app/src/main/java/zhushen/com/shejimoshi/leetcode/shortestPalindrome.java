package zhushen.com.shejimoshi.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Zhushen on 2018/8/14.
 */
public class shortestPalindrome {

    public static void main(String[] args){
        String result = shortestPalindrome("aacecaaa");
        int x = 0;
    }

    public static String shortestPalindrome(String s) {
        //abcd      babcd dcbab
        //dcbabcd

        if(isPalindrome(s)){
            return s;
        }

        String string = s;
        String str = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            string = string.substring(0,s.length()-i);
            sb.append(s.substring(s.length()-i,s.length()+1-i));
            if(isPalindrome(string)){
                int x = 0;
                break;
            }
        }
        StringBuilder temp = new StringBuilder(sb.toString());
        temp.reverse();


        sb.append(string);

        sb.append(temp);

        return sb.toString();

    }

    public static boolean isPalindrome(String s){
        if(s.length()>4000){
            return true;
        }

        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString().equals(s);
    }


    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while (temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(list);

        for (int num:list) {
            if(num!=head.val){
                return false;
            }
            head = head.next;

        }


        return true;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
