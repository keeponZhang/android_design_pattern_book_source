package zhushen.com.shejimoshi.chapter11.practice;

import android.graphics.Path;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class CircleBrush implements IBrush {
    @Override
    public void down(Path path, float x, float y) {

    }

    @Override
    public void move(Path path, float x, float y) {
        path.addCircle(x,y,10,Path.Direction.CW);

    }

    @Override
    public void up(Path path, float x, float y) {

    }
}
