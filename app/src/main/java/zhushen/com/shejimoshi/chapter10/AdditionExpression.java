package zhushen.com.shejimoshi.chapter10;

import android.content.Context;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class AdditionExpression extends OperatorlExpression {
    public AdditionExpression(AbstractExpression expression1, AbstractExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() + expression2.interpret();
    }
}
