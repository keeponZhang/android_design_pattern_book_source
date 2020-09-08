package zhushen.com.shejimoshi.chapter20.example1;

/**
 * Created by Zhushen on 2018/6/4.
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
