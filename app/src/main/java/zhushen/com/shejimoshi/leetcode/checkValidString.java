package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/8/24.
 */
public class checkValidString {
    public boolean checkValidString(String s) {
        //()*()
        //((*))
        int left = 0, right = 0, star = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left++;
            }
            else if (c == ')') {
                right++;
            }
            else if (c == '*') {
                star++;
            }
        }

        if (star < Math.abs(left - right)) {
            System.out.println("false");
            return false;
        }
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp == '(') {
                leftStack.push(i);
            }
            else if (tmp == '*') {
                starStack.push(i);
            }
            else if (tmp == ')') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
                else if(!starStack.isEmpty()) {
                    starStack.pop();
                }
                else {
                    System.out.println("false");
                    return false;
                }
            }
        }
        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            if (starStack.pop() < leftStack.pop()) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println(leftStack.isEmpty());
        return leftStack.isEmpty();

    }
}
