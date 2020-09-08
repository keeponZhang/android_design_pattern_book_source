package zhushen.com.shejimoshi.chapter17.example1;

/**
 * Created by Zhushen on 2018/5/29.
 */
class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ConcreteColleagueB handle message ti mediator");

    }
}
