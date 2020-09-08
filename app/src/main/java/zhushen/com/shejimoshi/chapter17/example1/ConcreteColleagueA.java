package zhushen.com.shejimoshi.chapter17.example1;

/**
 * Created by Zhushen on 2018/5/29.
 */
class ConcreteColleagueA extends Colleague{
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ConcreteColleagueA handle message ti mediator");
    }
}
