package zhushen.com.shejimoshi.chapter10;

import java.util.Stack;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class Calculator {
    private Stack<AbstractExpression> mExpStack = new Stack<>();

    public Calculator(String expression) {
        AbstractExpression expression1,expression2;

        String[] elements = expression.split(" ");

        for(int i = 0;i<elements.length;i++){
            switch (elements[i].charAt(0)){
                case '+':
                    expression1 = mExpStack.pop();
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new AdditionExpression(expression1,expression2));
                    break;
                    default:
                        mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                        break;
            }
        }
    }

    public int calculate(){
        return mExpStack.pop().interpret();
    }
}
