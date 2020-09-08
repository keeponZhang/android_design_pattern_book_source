package zhushen.com.shejimoshi.chapter9.example3;

/**
 * Created by Zhushen on 2018/5/9.
 */
public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("Manager handle request : "+ money );
    }
}
