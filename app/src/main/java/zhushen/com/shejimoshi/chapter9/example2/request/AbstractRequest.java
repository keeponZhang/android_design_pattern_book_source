package zhushen.com.shejimoshi.chapter9.example2.request;

/**
 * Created by Zhushen on 2018/5/9.
 */
public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj){
        this.obj = obj;
    }

    public Object getContent() {
        return obj;
    }

    public abstract int getRequestLevel();
}
