package zhushen.com.shejimoshi.chapter18.example1;

/**
 * Created by Zhushen on 2018/5/30.
 */
public class Client {
    public static void main(String[] args){
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);

        proxySubject.visit();
    }
}
