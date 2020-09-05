package com.wbb.dp.chapter10;

/**
 * @author vico
 * @date 2018-11-15
 */
public class SubtractionExpression extends OperatorExpression {

    public SubtractionExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
