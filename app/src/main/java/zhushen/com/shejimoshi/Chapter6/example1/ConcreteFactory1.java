package zhushen.com.shejimoshi.Chapter6.example1;

/**
 * Created by Zhushen on 2018/5/4.
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
