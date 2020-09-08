package zhushen.com.shejimoshi.chapter17.example1;

/**
 * Created by Zhushen on 2018/5/29.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void action();
}
