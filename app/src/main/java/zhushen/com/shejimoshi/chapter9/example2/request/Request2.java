package zhushen.com.shejimoshi.chapter9.example2.request;

/**
 * Created by Zhushen on 2018/5/9.
 */
public class Request2 extends AbstractRequest {
    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
