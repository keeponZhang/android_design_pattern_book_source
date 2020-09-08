package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/8/17.
 */
public class calPoints {

    public static void main(String[] args){
        String[] ops = new String[]{"1","2","3","4"};
        int result = calPoints(ops);
        int x = 0;
    }

    //1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
    //2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
    //3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
    //4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String str:ops) {
            if(str.equals("+")){
                int val = stack.pop();
                int val2 = stack.peek();
                stack.push(val);
                stack.push(val+val2);
            }else if(str.equals("D")){
                int val = stack.peek();
                stack.push(val*2);
            }else if(str.equals("C")){
                stack.pop();
            }else{
                int val = Integer.parseInt(str);
                stack.push(val);
            }
        }

        int sum = 0;
        for (int x:stack) {
            sum += x;
        }

        return sum;
    }
}
