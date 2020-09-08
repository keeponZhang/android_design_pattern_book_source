package zhushen.com.shejimoshi.chapter11.practice;

import android.graphics.Path;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class NormalBrush implements IBrush {
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
