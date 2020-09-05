package com.wbb.dp.chapter06;

/**
 * @author vico
 * @date 2018-10-20
 */
public abstract class CarFactory {
    /**
     * 生产轮胎
     * @return 轮胎
     */
    public abstract ITrie createTire();

    /**
     * 生产发动机
     * @return 发动机
     */
    public abstract IEngine createEngine();

    /**
     * 生产制动系统
     * @return 制动系统
     */
    public abstract IBrake createBrake();
}
