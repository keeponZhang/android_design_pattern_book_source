package zhushen.com.shejimoshi.chapter24.example3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Zhushen on 2018/12/11.
 */
public abstract class BaseProgressBar {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int CIRCLE = 2;

    protected Paint mPaint;

    public BaseProgressBar() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG|Paint.DITHER_FLAG);
    }

    public abstract int getMeasureHeight();

    public abstract int getMeasureWidth();

    public abstract void draw(View view, Canvas canvas);
}
