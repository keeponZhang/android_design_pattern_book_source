package zhushen.com.shejimoshi.chapter18.example1;

/**
 * Created by Zhushen on 2018/5/30.
 */
public class ProxySubject extends Subject {
    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        realSubject.visit();
    }
}
