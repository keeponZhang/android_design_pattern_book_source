package zhushen.com.shejimoshi.chapter16.example;

import java.util.Random;

/**
 * Created by Zhushen on 2018/5/23.
 */
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt(10 * 10000);
    }
}
