package com.wbb.dp.chapter02.DCL;

/**
 * Double Check Lock(DCL)实现单例
 * Created by vico on 2018-05-29.
 */

public class Singleton {
    private static Singleton sInstance = null;

    private Singleton() {
    }

    public void doSomething() {
        System.out.println("do sth.");
    }

    public static Singleton getInstance() {
        if (sInstance == null) {
            synchronized (Singleton.class) {
                if (sInstance == null) {
                    sInstance = new Singleton();
                }
            }
        }
        return sInstance;
    }
}
