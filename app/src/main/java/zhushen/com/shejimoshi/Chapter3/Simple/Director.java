package zhushen.com.shejimoshi.Chapter3.Simple;

/**
 * Created by Zhenshen on 2017/3/2.
 */

public class Director {
    Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public void construct(String board ,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
