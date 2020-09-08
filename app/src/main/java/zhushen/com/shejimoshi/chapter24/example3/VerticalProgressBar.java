package zhushen.com.shejimoshi.chapter24.example3;

import android.graphics.Canvas;
import android.view.View;

/**
 * Created by Zhushen on 2018/12/11.
 */
public class VerticalProgressBar extends BaseProgressBar {
    @Override
    public int getMeasureHeight() {
        return 1000;
    }

    @Override
    public int getMeasureWidth() {
        return 50;
    }

    @Override
    public void draw(View view, Canvas canvas) {

    }
}
