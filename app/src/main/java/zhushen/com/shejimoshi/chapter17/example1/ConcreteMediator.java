package zhushen.com.shejimoshi.chapter17.example1;

/**
 * Created by Zhushen on 2018/5/29.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
