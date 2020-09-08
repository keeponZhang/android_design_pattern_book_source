package zhushen.com.shejimoshi.chapter24.example1;

/**
 * Created by Zhushen on 2018/12/11.
 */
public class Client {

    public static void main(String[] args){
        RefinedAbstraction abstraction =
                new RefinedAbstraction( new ConcreteImplementorA() );

        abstraction.operation();
        abstraction.refinedOperation();

    }
}
