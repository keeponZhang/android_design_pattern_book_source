package zhushen.com.shejimoshi.Chapter2.exampleTwo;

/**
 * Created by Zhenshen on 2017/3/1.
 * 懒汉式
 * 缺点：1即使instance已初始化，每次仍会同步，消耗不需要的资源
 *      2.第一次加载需要及时进行实例化，反应慢
 * 优点：在使用时才会实例化，一定程度节约资源
 *
 */

public class Singleton {
    private static Singleton instance;

    public Singleton() {
    }

    //synchronized关键字在多线程情况下保证单例对象唯一
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
