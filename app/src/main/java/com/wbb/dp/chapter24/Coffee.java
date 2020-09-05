package com.wbb.dp.chapter24;

/**
 * @author weibb
 * @date 2019/1/9
 * email: weibb@chingo.cn
 */
public abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 咖啡具体时什么样的由子类决定
     */
    public abstract void makeCoffee();
}
