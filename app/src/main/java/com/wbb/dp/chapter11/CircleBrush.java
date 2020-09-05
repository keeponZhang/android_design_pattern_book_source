package com.wbb.dp.chapter11;

import android.graphics.Path;

/**
 * 圆形笔触
 *
 * @author vico
 * @date 2018-11-17
 */
public class CircleBrush implements IBrush {
    @Override
    public void down(Path path, float x, float y) {

    }

    @Override
    public void move(Path path, float x, float y) {
        path.addCircle(x, y, 10, Path.Direction.CW);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
