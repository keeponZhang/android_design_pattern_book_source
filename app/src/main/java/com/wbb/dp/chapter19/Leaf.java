package com.wbb.dp.chapter19;

/**
 * 具体叶子节点
 *
 * @author vico
 * @date 2018-12-30
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
