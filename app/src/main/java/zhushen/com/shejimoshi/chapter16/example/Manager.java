package zhushen.com.shejimoshi.chapter16.example;

import java.util.Random;

/**
 * Created by Zhushen on 2018/5/23.
 */
public class Manager extends Staff {
    private int products;
    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return products;
    }
}
