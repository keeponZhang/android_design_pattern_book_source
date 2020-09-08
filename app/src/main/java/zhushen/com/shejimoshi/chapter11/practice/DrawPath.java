package zhushen.com.shejimoshi.chapter11.practice;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class DrawPath implements IDraw {
    public Path path;
    public Paint paint;

    @Override
    public void draw(Canvas canvas) {
        canvas.drawPath(path,paint);
    }

    @Override
    public void undo() {

    }
}
