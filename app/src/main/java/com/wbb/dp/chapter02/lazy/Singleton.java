package com.wbb.dp.chapter02.lazy;

/**
 * 懒汉模式
 * Created by vico on 2018-05-29.
 */

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
