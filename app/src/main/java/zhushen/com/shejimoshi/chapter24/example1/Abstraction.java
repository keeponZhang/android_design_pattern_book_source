package zhushen.com.shejimoshi.chapter24.example1;

/**
 * Created by Zhushen on 2018/12/11.
 */
public abstract class Abstraction {
    private Implementor mImplementor;

    public Abstraction(Implementor mImplementor) {
        this.mImplementor = mImplementor;
    }

    public void operation(){
        mImplementor.operationImpl();
    }
}
