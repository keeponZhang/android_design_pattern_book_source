package zhushen.com.shejimoshi.chapter11.practice;

import android.graphics.Canvas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class DrawInvoker {
    private List<DrawPath> drawPathList = Collections.synchronizedList(new ArrayList<DrawPath>());

    private List<DrawPath> redoList = Collections.synchronizedList(new ArrayList<DrawPath>());

    public void add(DrawPath command){
        redoList.clear();
        drawPathList.add(command);
    }

    public void undo(){
        if(drawPathList.size()>0){
            DrawPath undo = drawPathList.get(drawPathList.size() -1);
            drawPathList.remove(undo);
            undo.undo();
            redoList.add(undo);
        }
    }

    public void redo(){
        if(redoList.size()>0){
            DrawPath redo = redoList.get(redoList.size() -1);
            redoList.remove(redoList.size() -1);
            drawPathList.add(redo);
        }
    }

    public void execute(Canvas canvas){
        if(drawPathList != null){
            for (DrawPath tmp:drawPathList) {
                tmp.draw(canvas);
            }
        }
    }

    public boolean canRedo(){
        return redoList.size()>0;
    }

    public boolean canUndo(){
        return drawPathList.size()>0;
    }

}
