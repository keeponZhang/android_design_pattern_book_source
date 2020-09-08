package zhushen.com.shejimoshi.chapter10;

import android.content.Context;

/**
 * Created by Zhushen on 2018/5/10.
 */
public abstract class OperatorlExpression extends AbstractExpression {
    protected AbstractExpression expression1,expression2;

    public OperatorlExpression(AbstractExpression expression1, AbstractExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

}
