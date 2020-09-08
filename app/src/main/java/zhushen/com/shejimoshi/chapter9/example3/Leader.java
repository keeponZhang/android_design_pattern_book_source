package zhushen.com.shejimoshi.chapter9.example3;

/**
 * Created by Zhushen on 2018/5/9.
 */
public abstract class Leader {
    protected Leader nextHandler;

    public final void handleRequest(int money){
        if(money<=limit()){
            handle(money);
        }else if(nextHandler !=null){
            nextHandler.handleRequest(money);
        }else {
            System.out.println("no one can handle this request");
        }
    }

    public abstract int limit();

    public abstract void handle(int money);

}
