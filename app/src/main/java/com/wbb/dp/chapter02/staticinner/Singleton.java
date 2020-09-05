package com.wbb.dp.chapter02.staticinner;

/**
 * 静态内部类单例模式
 * Created by vico on 2018-05-29.
 */

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}
