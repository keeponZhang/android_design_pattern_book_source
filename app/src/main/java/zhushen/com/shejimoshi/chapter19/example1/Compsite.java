package zhushen.com.shejimoshi.chapter19.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/6/1.
 */
public class Compsite extends Component {

    private List<Component> components = new ArrayList<>();

    public Compsite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if(null!=components){
            for (Component c:components) {
                c.doSomething();
            }
        }
    }

    public void addChild(Component component){
        components.add(component);
    }

    public void removeChild(Component component){
        components.remove(component);
    }

    public Component getChildAt(int index){
        return components.get(index);
    }
}
