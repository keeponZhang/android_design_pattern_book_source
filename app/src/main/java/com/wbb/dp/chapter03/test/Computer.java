package com.wbb.dp.chapter03.test;

/**
 * 计算机抽象类，即Product角色
 * Created by vico on 2018-05-30.
 */

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer(){

    }
    //设置主板
    public void setBoard(String board) {
        mBoard = board;
    }
    //设置显示器
    public void setDisplay(String display) {
        mDisplay = display;
    }
    //设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
