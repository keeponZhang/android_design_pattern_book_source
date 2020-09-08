package zhushen.com.shejimoshi.chapter9.example2.request;

/**
 * Created by Zhushen on 2018/5/9.
 */
public class Request3 extends AbstractRequest {
    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}
