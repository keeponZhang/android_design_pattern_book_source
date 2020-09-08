package zhushen.com.shejimoshi.chapter16.example;

/**
 * Created by Zhushen on 2018/5/23.
 */
public interface Visitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
