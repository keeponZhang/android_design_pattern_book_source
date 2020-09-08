package zhushen.com.shejimoshi.Chapter6.example1;

/**
 * Created by Zhushen on 2018/5/4.
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
