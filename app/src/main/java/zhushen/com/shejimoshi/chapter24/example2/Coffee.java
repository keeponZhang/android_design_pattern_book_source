package zhushen.com.shejimoshi.chapter24.example2;

/**
 * Created by Zhushen on 2018/12/11.
 */
public abstract class Coffee {
    protected  CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();
}
