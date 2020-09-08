package zhushen.com.shejimoshi.Chapter6.example2.factory;

import zhushen.com.shejimoshi.Chapter6.example2.brake.IBrake;
import zhushen.com.shejimoshi.Chapter6.example2.brake.SeniorBrake;
import zhushen.com.shejimoshi.Chapter6.example2.engine.IEngine;
import zhushen.com.shejimoshi.Chapter6.example2.engine.ImportEngine;
import zhushen.com.shejimoshi.Chapter6.example2.tire.ITire;
import zhushen.com.shejimoshi.Chapter6.example2.tire.SUVTire;

/**
 * Created by Zhushen on 2018/5/4.
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
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
