package zhushen.com.shejimoshi.Chapter2.enmu;

/**
 * Created by Zhenshen on 2017/3/1.
 * 优点：简单
 *      线程默认安全
 *      任何情况下都是一个单例（反序列化）
 */

public enum  SingletonEnmu {
    INSTANCE;
    public void doSomething(){
        //do something
    }
}
