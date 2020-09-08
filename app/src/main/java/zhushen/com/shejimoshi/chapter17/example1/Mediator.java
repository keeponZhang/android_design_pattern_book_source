package zhushen.com.shejimoshi.chapter17.example1;

/**
 * Created by Zhushen on 2018/5/29.
 */
public abstract class Mediator {
    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public abstract void method();

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
