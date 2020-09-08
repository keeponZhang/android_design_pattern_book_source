package zhushen.com.shejimoshi.chapter21.example1;

/**
 * Created by Zhushen on 2018/8/20.
 */
public class Client {
    public static void main(String[] args){
        Component component = new ConcreteComponent();

        Deorator deorator = new ConcreteDecoratorA(component);
        deorator.operate();

        Deorator deoratorB = new ConcreteDecoratorB(component);
        deoratorB.operate();
    }
}
