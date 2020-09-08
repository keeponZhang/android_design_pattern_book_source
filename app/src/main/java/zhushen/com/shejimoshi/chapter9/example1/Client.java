package zhushen.com.shejimoshi.chapter9.example1;

/**
 * Created by Zhushen on 2018/5/8.
 */
public class Client {
    public static  void main(String[] args){
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        handler1.successor = handler2;
        handler2.successor = handler1;

        handler1.handleRequest("ConcreteHandler2");
    }
}
