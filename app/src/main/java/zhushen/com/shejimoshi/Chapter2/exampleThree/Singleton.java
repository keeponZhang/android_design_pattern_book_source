package zhushen.com.shejimoshi.Chapter2.exampleThree;

/**
 * Created by Zhenshen on 2017/3/1.
 * DoubleCheckLock 双重锁
 * 主要是为了解决synchronized关键字导致的时延
 * 优点：资源利用率高
 * 缺点：第一次加载慢
 *         高并发时有可能出问题（概率不大）
 */

public class Singleton {
    private  static Singleton mInstance = null;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if(mInstance == null){
            synchronized (Singleton.class){
                if(mInstance == null){
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
}
