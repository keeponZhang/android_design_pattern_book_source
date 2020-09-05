package com.wbb.dp.chapter10;

/**
 * 数字解释器 仅仅为了解释数字
 * @author vico
 * @date 2018-11-15
 */
public class NumExpression extends ArithmeticExpression {

    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
