package zhushen.com.shejimoshi.chapter11.example2;

/**
 * Created by Zhushen on 2018/5/11.
 */
public class Player {
    public static void main(String[] args){
        TetrisMachine machine = new TetrisMachine();

        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        FallCommand fallCommand = new FallCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransformCommand(transformCommand);

        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();
    }
}
