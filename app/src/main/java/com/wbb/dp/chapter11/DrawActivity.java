package com.wbb.dp.chapter11;

import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.simple.net.demo.R;

public class DrawActivity extends AppCompatActivity implements View.OnClickListener {

    private DrawCanvas mCanvas;//绘制画布
    private DrawPath mPath;//路径绘制命令
    private Paint mPaint;//画笔对象
    private IBrush mBrush;//笔触对象

    private Button btnRedo, btnUndo;//重做、撤消操作


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        mPaint = new Paint();
        mPaint.setColor(0xFFFFFFFF);
        mPaint.setStrokeWidth(3);

        mBrush = new NormalBrush();

        mCanvas = findViewById(R.id.ac_draw_canvas);
        mCanvas.setOnTouchListener(new DrawTouchListener());

        btnRedo = findViewById(R.id.ac_draw_operate_redo_btn);
        btnRedo.setEnabled(false);
        btnRedo.setOnClickListener(this);
        btnUndo = findViewById(R.id.ac_draw_operate_undo_btn);
        btnUndo.setEnabled(false);
        btnUndo.setOnClickListener(this);
        findViewById(R.id.ac_draw_color_red_btn).setOnClickListener(this);
        findViewById(R.id.ac_draw_color_green_btn).setOnClickListener(this);
        findViewById(R.id.ac_draw_color_blue_btn).setOnClickListener(this);
        findViewById(R.id.ac_draw_brush_normal_btn).setOnClickListener(this);
        findViewById(R.id.ac_draw_brush_circle_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ac_draw_color_red_btn://切换为红色
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(0xFFFF0000);
                break;
            case R.id.ac_draw_color_green_btn://切换为绿色
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(0xFF00FF00);
                break;
            case R.id.ac_draw_color_blue_btn://切换为蓝色
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(0xFF0000FF);
                break;
            case R.id.ac_draw_operate_undo_btn://撤消操作
                mCanvas.undo();
                if (!mCanvas.canUndo()) {
                    btnUndo.setEnabled(false);
                }
                btnRedo.setEnabled(true);
                break;
            case R.id.ac_draw_operate_redo_btn://重做操作
                mCanvas.redo();
                if (!mCanvas.canRedo()) {
                    btnRedo.setEnabled(false);
                }
                btnUndo.setEnabled(true);
                break;
            case R.id.ac_draw_brush_circle_btn://切换为圆形笔触
                mBrush = new CircleBrush();
                break;
            case R.id.ac_draw_brush_normal_btn://切换为正常笔触
                mBrush = new NormalBrush();
                break;
            default:
                break;
        }
    }

    private class DrawTouchListener implements View.OnTouchListener {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                mPath = new DrawPath();
                mPath.paint = mPaint;
                mPath.path = new Path();
                mBrush.down(mPath.path, event.getX(), event.getY());
            } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                mBrush.move(mPath.path, event.getX(), event.getY());
            } else if (event.getAction() == MotionEvent.ACTION_UP) {
                mBrush.up(mPath.path, event.getX(), event.getY());
                mCanvas.add(mPath);
                mCanvas.isDrawing = true;
                btnUndo.setEnabled(true);
                btnRedo.setEnabled(false);
            }
            return true;
        }
    }
}
