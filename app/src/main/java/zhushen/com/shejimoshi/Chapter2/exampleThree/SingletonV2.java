package zhushen.com.shejimoshi.Chapter2.exampleThree;

/**
 * Created by Zhenshen on 2017/3/1.
 * 静态内部类实现
 * 第一次加载该类时不会初始化instance，
 * 只有在第一次调用getInstance方法的时候才会导致mInstance的初始化
 * 优点：线程安全，单例对象唯一性
 */

public class SingletonV2 {
    public SingletonV2() {
    }

    public static SingletonV2 getInstance(){
        return SingletonHolder.mInstance;
    }



    /**
    *  静态内部类
    * **/
    private static class SingletonHolder{
        private static final SingletonV2 mInstance = new SingletonV2();

}
}
