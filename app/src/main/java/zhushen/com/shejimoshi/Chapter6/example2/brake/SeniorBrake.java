package zhushen.com.shejimoshi.Chapter6.example2.brake;

/**
 * Created by Zhushen on 2018/5/4.
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("senior brake");
    }
}
