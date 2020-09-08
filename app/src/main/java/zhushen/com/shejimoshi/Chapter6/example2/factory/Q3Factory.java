package zhushen.com.shejimoshi.Chapter6.example2.factory;

import zhushen.com.shejimoshi.Chapter6.example2.brake.IBrake;
import zhushen.com.shejimoshi.Chapter6.example2.brake.NormalBrake;
import zhushen.com.shejimoshi.Chapter6.example2.engine.DomesticEngine;
import zhushen.com.shejimoshi.Chapter6.example2.engine.IEngine;
import zhushen.com.shejimoshi.Chapter6.example2.tire.ITire;
import zhushen.com.shejimoshi.Chapter6.example2.tire.NormalTire;

/**
 * Created by Zhushen on 2018/5/4.
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
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
