package zhushen.com.shejimoshi.chapter21.example1;

/**
 * Created by Zhushen on 2018/8/20.
 */
public class ConcreteDecoratorB extends Deorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    private void operateB() {
    }

    private void operateA() {
    }
}
