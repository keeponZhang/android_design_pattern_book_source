package zhushen.com.shejimoshi.chapter11.example2;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class RightCommand implements Command {
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toRight();
    }
}
