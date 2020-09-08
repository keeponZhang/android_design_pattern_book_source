package zhushen.com.shejimoshi.chapter9.example2.handle;

import zhushen.com.shejimoshi.chapter9.example2.request.AbstractRequest;

/**
 * Created by Zhushen on 2018/5/9.
 */
public abstract class AbstractHandler {
    public AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest request){
        if(getHandleLevel() == request.getRequestLevel()){
            handle(request);
        }else {
            if(nextHandler!=null){
                nextHandler.handleRequest(request);
            }else {
                System.out.print("All of handle can not handle the request");
            }
        }
    }

    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest request);
}
