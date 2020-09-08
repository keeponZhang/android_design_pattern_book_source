package zhushen.com.shejimoshi.leetcode;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/8/29.
 */
public class asteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<asteroids.length;i++){
            //如果栈为空或者大于0
            if(stack.isEmpty()||asteroids[i]>0){
                stack.push(asteroids[i]);
                continue;
            }

            //遇见不同方向元素
            while(true){
                int pre=stack.peek();
                if(pre<0){
                    //当栈顶为负数时
                    stack.push(asteroids[i]);
                    break;
                }else if(pre==-asteroids[i]){
                    //两个元素相同,消掉栈顶元素
                    stack.pop();
                    break;
                }else if(pre>-asteroids[i]){
                    //栈顶元素更大，消掉
                    break;
                }else {
                    //栈顶元素更小，依次迭代和栈顶比较，直至满足条件

                    stack.pop();
                    //如果栈为空了，就直接放入，否则继续循环比较
                    if(stack.isEmpty()){
                        stack.push(asteroids[i]);
                        break;
                    }
                }
            }
        }
        //将stack结果输出
        int [] res=new int[stack.size()];
        int i=stack.size()-1;
        while(!stack.empty()){
            res[i--]=stack.pop();
        }
        return res;

    }
}
