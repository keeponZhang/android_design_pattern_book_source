package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/11/5.
 */
public class longestValidParentheses {

    public int longestValidParentheses(String s) {
        int n = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(0);
            }else{
                if(stack.size()==0){
                    continue;
                }else if(stack.size()==1){
                    if(stack.pop()==0){
                        stack.push(2);
                        max = Math.max(max,2);
                    }
                }else{
                    if(stack.peek()==0){
                        stack.pop();
                        int num = 2;
                        if(stack.peek()!=0){
                            num += stack.pop();
                        }
                        stack.push(num);
                        max = Math.max(max,num);
                    }else{
                        int temp = stack.pop();
                        stack.pop();
                        temp+=2;
                        if(!stack.isEmpty()&&stack.peek()!=0){
                            temp += stack.pop();
                        }
                        max = Math.max(max,temp);
                        stack.push(temp);
                    }
                }
            }
        }

        return max;
    }
}
