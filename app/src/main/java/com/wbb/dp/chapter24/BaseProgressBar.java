package com.wbb.dp.chapter24;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * @author weibb
 * @date 2019/1/9
 * email: weibb@chingo.cn
 */
public abstract class BaseProgressBar {
    public static final int HORIZONTAL = 0;//水平进度条标志
    public static final int VERTICAL = 1;//垂直进度条标识
    public static final int CIRCLE = 2;//圆形进度条标识

    protected Paint mPaint;

    /**
     * 构造方法内完成一些具体的初始化信息
     */
    protected BaseProgressBar() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
    }

    /**
     * 获取测量高度，由具体子类实现
     *
     * @return 测量高度
     */
    public abstract int getMeasureHeight();

    /**
     * 获取测量宽度，由具体子类实现
     *
     * @return 测量宽度
     */
    public abstract int getMeasureWidth();

    /**
     * 具体的绘制操作，由具体子类实现
     *
     * @param view   View
     * @param canvas Canvas
     */
    public abstract void draw(View view, Canvas canvas);
}
