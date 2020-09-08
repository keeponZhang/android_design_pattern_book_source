package zhushen.com.shejimoshi.Chapter6.example2.factory;

import zhushen.com.shejimoshi.Chapter6.example2.brake.IBrake;
import zhushen.com.shejimoshi.Chapter6.example2.engine.IEngine;
import zhushen.com.shejimoshi.Chapter6.example2.tire.ITire;

/**
 * Created by Zhushen on 2018/5/4.
 */
public abstract class CarFactory {
    public abstract ITire createTire();

    public abstract IEngine createEngine();

    public abstract IBrake createBrake();
}
