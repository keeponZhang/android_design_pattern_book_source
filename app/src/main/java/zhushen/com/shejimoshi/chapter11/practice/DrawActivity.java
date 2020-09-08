package zhushen.com.shejimoshi.chapter11.practice;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.nio.channels.NonReadableChannelException;

import zhushen.com.shejimoshi.R;

import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_MOVE;
import static android.view.MotionEvent.ACTION_UP;

public class DrawActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawCanvas mCanvas;
    private DrawPath mPath;
    private Paint mPaint;
    private IBrush mBrush;

    private Button btnRedo,btnUndo;
    private Button normalBrush,circleBrush;
    private Button redBtn,greenBtn,blueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        
        init();
    }

    private void init() {
        btnRedo = (Button)findViewById(R.id.redo_btn);
        btnUndo = (Button)findViewById(R.id.undo_btn);
        btnRedo.setEnabled(false);
        btnUndo.setEnabled(false);

        btnRedo.setOnClickListener(this);
        btnUndo.setOnClickListener(this);

        normalBrush = (Button)findViewById(R.id.normal_brush);
        circleBrush = (Button)findViewById(R.id.circle_brush);

        normalBrush.setOnClickListener(this);
        circleBrush.setOnClickListener(this);

        redBtn = (Button)findViewById(R.id.color_red);
        greenBtn = (Button)findViewById(R.id.color_green);
        blueBtn = (Button)findViewById(R.id.color_blue);

        redBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        blueBtn.setOnClickListener(this);

        mPaint = new Paint();
        mPaint.setColor(0xffffffff);
        mPaint.setStrokeWidth(3);

        mBrush = new NormalBrush();

        mCanvas = (DrawCanvas)findViewById(R.id.draw_canvas);
        mCanvas.setOnTouchListener(new DrawTouchListener());
        mCanvas.setClickable(true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.redo_btn:
                mCanvas.redo();
                if(!mCanvas.canRedo()){
                    btnRedo.setEnabled(false);
                }
                btnUndo.setEnabled(true);
                break;
            case R.id.undo_btn:
                mCanvas.undo();
                if(!mCanvas.canUndo()){
                    btnUndo.setEnabled(false);
                }
                btnRedo.setEnabled(true);
                break;
            case R.id.normal_brush:
                mBrush = new NormalBrush();
                break;
            case R.id.circle_brush:
                mBrush = new CircleBrush();
                break;
            case R.id.color_red:
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(Color.RED);
                break;
            case R.id.color_green:
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(Color.GREEN);
                break;
            case R.id.color_blue:
                mPaint = new Paint();
                mPaint.setStrokeWidth(3);
                mPaint.setColor(Color.BLUE);
                break;
        }
    }


    private class DrawTouchListener implements View.OnTouchListener{

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case ACTION_DOWN:
                    mPath = new DrawPath();
                    mPath.paint = mPaint;
                    mPath.path = new Path();
                    mBrush.down(mPath.path,event.getX(),event.getY());
                    break;
                case ACTION_MOVE:
                    mBrush.move(mPath.path,event.getX(),event.getY());
                    break;
                case ACTION_UP:
                    mBrush.up(mPath.path,event.getX(),event.getY());
                    mCanvas.add(mPath);
                    mCanvas.isDrawing = true;
                    btnRedo.setEnabled(true);
                    btnUndo.setEnabled(true);
                    break;
            }

            return false;
        }
    }
}
