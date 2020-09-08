package zhushen.com.shejimoshi.chapter11.example2;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class FallCommand implements Command {
    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.fastToBottom();
    }
}
