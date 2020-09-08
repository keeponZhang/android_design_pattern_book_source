package zhushen.com.shejimoshi.chapter20.example1;

/**
 * Created by Zhushen on 2018/6/4.
 */
public class VoltAdapter2 implements FiveVolt {
    Volt220 volt220;

    public VoltAdapter2(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public int getVolt220(){
        return volt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
