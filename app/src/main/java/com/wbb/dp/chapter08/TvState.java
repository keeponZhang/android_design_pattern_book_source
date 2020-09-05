package com.wbb.dp.chapter08;

/**
 * 电视状态接口，定义了电视操作的函数
 * @author vico
 * @date 2018-11-05
 */
public interface TvState {
    public void nextChannel();

    public void prevChannel();

    public void turnUp();

    public void turnDown();
}
