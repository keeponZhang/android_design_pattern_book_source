package zhushen.com.shejimoshi.chapter11.practice;

import android.graphics.Path;

/**
 * Created by Zhushen on 2018/5/11.
 */
public interface IBrush {
    void down(Path path, float x, float y);
    void move(Path path, float x, float y);
    void up(Path path, float x, float y);
}
