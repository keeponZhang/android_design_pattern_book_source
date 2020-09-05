package com.wbb.dp.chapter03.test;

/**
 * 抽象Builder类
 * Created by vico on 2018-05-30.
 */

public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);

    //设置显示器
    public abstract void buildDisplay(String display);

    //设置操作系统
    public abstract void buildOS();

    //创建Computer
    public abstract Computer create();
}
