package zhushen.com.shejimoshi.chapter8.example.state;

/**
 * Created by Zhushen on 2018/5/8.
 */
public class PowerOffState implements TVState {
    @Override
    public void nextChannel() {
        System.out.println("no power");
    }

    @Override
    public void prevChannel() {
        System.out.println("no power");
    }

    @Override
    public void turnUp() {
        System.out.println("no power");
    }

    @Override
    public void turnDown() {
        System.out.println("no power");
    }
}
