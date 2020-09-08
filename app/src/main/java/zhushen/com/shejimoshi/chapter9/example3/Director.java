package zhushen.com.shejimoshi.chapter9.example3;

/**
 * Created by Zhushen on 2018/5/9.
 */
public class Director extends Leader {
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("Director handle request : "+ money );
    }
}
