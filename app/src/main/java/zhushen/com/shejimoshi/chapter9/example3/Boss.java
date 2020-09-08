package zhushen.com.shejimoshi.chapter9.example3;

/**
 * Created by Zhushen on 2018/5/9.
 */
public class Boss extends Leader {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("Boss handle request : "+ money );
    }
}
