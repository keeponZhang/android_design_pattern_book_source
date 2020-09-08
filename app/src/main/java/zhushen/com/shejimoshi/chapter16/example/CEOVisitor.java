package zhushen.com.shejimoshi.chapter16.example;

/**
 * Created by Zhushen on 2018/5/23.
 */
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("engineer name : "+ engineer.name + ",kpi:" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("manager name : "+ manager.name + ",kpi:" + manager.kpi + ", products count :" + manager.getProducts());

    }
}
