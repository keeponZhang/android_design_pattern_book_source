package zhushen.com.shejimoshi.chapter11.practice;

import android.graphics.Canvas;

/**
 * Created by Zhushen on 2018/5/11.
 */
public interface IDraw {
    void draw(Canvas canvas);
    void undo();
}
