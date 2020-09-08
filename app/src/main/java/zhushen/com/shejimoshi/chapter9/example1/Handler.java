package zhushen.com.shejimoshi.chapter9.example1;

/**
 * Created by Zhushen on 2018/5/8.
 */
public abstract class Handler {
    protected Handler successor;

    public abstract void handleRequest(String condition);
}
