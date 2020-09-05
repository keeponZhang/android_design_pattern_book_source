package com.wbb.dp.chapter06;

/**
 * @author vico
 * @date 2018-10-20
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITrie createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
