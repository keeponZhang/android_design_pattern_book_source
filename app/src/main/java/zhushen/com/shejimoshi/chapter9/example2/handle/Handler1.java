package zhushen.com.shejimoshi.chapter9.example2.handle;

import zhushen.com.shejimoshi.chapter9.example2.request.AbstractRequest;

/**
 * Created by Zhushen on 2018/5/9.
 */
public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("handler1 handle request :" + request.getRequestLevel());
    }
}
