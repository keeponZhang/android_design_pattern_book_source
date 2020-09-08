package zhushen.com.shejimoshi.chapter16.example;

import java.util.Random;

/**
 * Created by Zhushen on 2018/5/23.
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
