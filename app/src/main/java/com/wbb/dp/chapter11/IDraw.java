package com.wbb.dp.chapter11;

import android.graphics.Canvas;

/**
 * @author vico
 * @date 2018-11-17
 */
public interface IDraw {
    /**
     * 绘制命令
     *
     * @param canvas
     */
    void draw(Canvas canvas);

    /**
     * 撤消命令
     */
    void undo();
}
