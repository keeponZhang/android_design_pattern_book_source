package zhushen.com.shejimoshi.chapter11.example2;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class LeftCommand implements Command {
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toLeft();
    }
}
