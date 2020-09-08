package zhushen.com.shejimoshi.Chapter6.example1;

/**
 * Created by Zhushen on 2018/5/4.
 */
public abstract class AbstractFactory {
    //create productA
    public abstract AbstractProductA createProductA();
    //create productB
    public abstract AbstractProductB createProductB();
}
