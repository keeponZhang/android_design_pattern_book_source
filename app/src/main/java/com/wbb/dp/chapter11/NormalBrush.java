package com.wbb.dp.chapter11;

import android.graphics.Path;

/**
 * 普通笔触
 * @author vico
 * @date 2018-11-17
 */
public class NormalBrush implements IBrush{
    @Override
    public void down(Path path, float x, float y) {
        path.moveTo(x,y);
    }

    @Override
    public void move(Path path, float x, float y) {
        path.lineTo(x,y);
    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
