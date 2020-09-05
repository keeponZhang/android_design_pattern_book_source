package com.wbb.dp.chapter02.enuminstance;

/**
 * 枚举单例
 * Created by vico on 2018-05-29.
 */

public enum SingletonEnum {
    INSTANCE;

    public void doSomething() {
        System.out.println("do sth.");
    }
}
