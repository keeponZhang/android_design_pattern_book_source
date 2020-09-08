package zhushen.com.shejimoshi.Chapter1.Window.LiskovSubsitutionPrinciple;


/**
 * Created by Zhenshen on 2017/2/24.
 * 这里的view不是java源码中的view
 * 而是自定义的View类
 *
 * window负责组织View
 */

public class Window {
    public void show(View child){
        child.draw();
    }

}

