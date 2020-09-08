package zhushen.com.shejimoshi.chapter8.example.state;

/**
 * Created by Zhushen on 2018/5/8.
 */
public class PowerOnState implements TVState {
    @Override
    public void nextChannel() {
        System.out.println("next channel");
    }

    @Override
    public void prevChannel() {
        System.out.println("prev channel");
    }

    @Override
    public void turnUp() {
        System.out.println("turn up");
    }

    @Override
    public void turnDown() {
        System.out.println("turn down");
    }
}
