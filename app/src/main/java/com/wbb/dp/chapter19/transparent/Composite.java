package com.wbb.dp.chapter19.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vico
 * @date 2018-12-30
 */
public class Composite extends Component {
    /**
     * 存储节点的容器
     */
    private List<Component> components=new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (null!=components){
            for (Component c : components) {
                c.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        components.remove(child);
    }

    @Override
    public void removeChild(Component child) {
        components.remove(child);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }
}
