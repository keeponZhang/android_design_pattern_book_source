package zhushen.com.shejimoshi.chapter20.example1;

/**
 * Created by Zhushen on 2018/6/4.
 */
public class Client {
    public static void main(String[] args){
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("output volt :" + adapter.getVolt5());

        VoltAdapter2 adapter2 = new VoltAdapter2(new Volt220());
        System.out.println("output volt2 :" + adapter2.getVolt5());
        System.out.println("output volt2 :" + adapter2.getVolt220());
    }
}
