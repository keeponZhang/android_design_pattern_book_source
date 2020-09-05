package com.wbb.dp.chapter06;

/**
 * @author vico
 * @date 2018-10-20
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITrie createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
