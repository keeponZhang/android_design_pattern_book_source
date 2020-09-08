package zhushen.com.shejimoshi.chapter9.example1;

/**
 * Created by Zhushen on 2018/5/8.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("ConcreteHandler2")){
            System.out.println("ConcreteHandler2 handled ");
            return;
        }else {
            successor.handleRequest(condition);
        }
    }
}
