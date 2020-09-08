package zhushen.com.shejimoshi.chapter11.example1;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
