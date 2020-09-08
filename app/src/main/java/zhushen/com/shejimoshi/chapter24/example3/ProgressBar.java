package zhushen.com.shejimoshi.chapter24.example3;


import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import zhushen.com.shejimoshi.R;

/**
 * Created by Zhushen on 2018/12/11.
 */
public class ProgressBar extends View {
    private static final int HEIGHT = 0x6846,WIDTH = 0x7889;

    private BaseProgressBar mBaseProgressBar;

    private int style = BaseProgressBar.CIRCLE;

    public ProgressBar(Context context) {
        this(context,null);
    }

    public ProgressBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,1);
    }

    public ProgressBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.ProgressBar,defStyleAttr,0);
        style = a.getInt(R.styleable.ProgressBar_style,BaseProgressBar.CIRCLE);

        if(style == BaseProgressBar.HORIZONTAL){
            mBaseProgressBar = new HorizontalProgressBar();
        }else if(style == BaseProgressBar.VERTICAL){
            mBaseProgressBar = new VerticalProgressBar();
        }else {
            mBaseProgressBar = new CircleProgressBar();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureDimension(WIDTH,widthMeasureSpec),measureDimension(HEIGHT,widthMeasureSpec));
    }

    private int measureDimension(int type, int measureSpec) {
        if(style == BaseProgressBar.CIRCLE){
            return mBaseProgressBar.getMeasureWidth();
        }

        int result;
        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);
        if(mode == MeasureSpec.EXACTLY){
            result = size;
        }else {
            if(type == HEIGHT){
                result = mBaseProgressBar.getMeasureHeight();
            }else {
                result = mBaseProgressBar.getMeasureWidth();
            }
            if(mode == MeasureSpec.AT_MOST){
                result = Math.min(result,size);
            }
        }

        return result;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mBaseProgressBar.draw(this,canvas);
    }
}
