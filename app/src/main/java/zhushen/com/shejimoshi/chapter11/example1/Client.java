package zhushen.com.shejimoshi.chapter11.example1;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class Client {
    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
