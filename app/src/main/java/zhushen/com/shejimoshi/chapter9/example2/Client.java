package zhushen.com.shejimoshi.chapter9.example2;

import zhushen.com.shejimoshi.chapter9.example2.handle.*;
import zhushen.com.shejimoshi.chapter9.example2.request.*;

/**
 * Created by Zhushen on 2018/5/9.
 */
public class Client {
    public static void main(String[] args){
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();

        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        AbstractRequest request1 = new Request1("request1");
        AbstractRequest request2 = new Request2("request2");
        AbstractRequest request3 = new Request3("request3");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
