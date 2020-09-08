package zhushen.com.shejimoshi.chapter19.example1;

/**
 * Created by Zhushen on 2018/6/1.
 */
public class Client {
    public static void main(String[] args){
        Compsite root = new Compsite("Root");

        Compsite branch1 = new Compsite("Branch1");
        Compsite branch2 = new Compsite("Branch2");

        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");

        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        root.addChild(branch1);
        root.addChild(branch2);

        root.doSomething();
    }
}
