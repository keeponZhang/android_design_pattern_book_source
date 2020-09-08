package zhushen.com.shejimoshi.chapter19.example1;

/**
 * Created by Zhushen on 2018/6/1.
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}
