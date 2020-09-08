package zhushen.com.shejimoshi.chapter21.example1;

/**
 * Created by Zhushen on 2018/8/20.
 */
public abstract class Deorator extends Component {
    private Component component;

    public Deorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {

    }
}
