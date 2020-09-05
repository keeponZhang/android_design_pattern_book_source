package com.wbb.dp.chapter03.test;

/**
 * Director类，负责构造Computer
 * Created by vico on 2018-05-30.
 */

public class Director {
    Builder mBuilder = null;

    /**
     * @param builder
     */
    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 构建对象
     */
    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
