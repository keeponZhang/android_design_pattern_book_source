package zhushen.com.shejimoshi.chapter19.example1;

/**
 * Created by Zhushen on 2018/6/1.
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomething();
}
