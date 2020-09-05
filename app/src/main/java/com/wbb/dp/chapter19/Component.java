package com.wbb.dp.chapter19;

/**
 * 抽象根节点
 * @author vico
 * @date 2018-12-30
 */
public abstract class Component {
    protected String name;//节点名

    public Component(String name){
        this.name=name;
    }

    /**
     * 具体的逻辑方法由子类实现
     */
    public abstract void doSomething();
}
