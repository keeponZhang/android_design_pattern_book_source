package zhushen.com.shejimoshi.chapter10;

import android.content.Context;

/**
 * Created by Zhushen on 2018/5/10.
 */
public class NumExpression extends AbstractExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
