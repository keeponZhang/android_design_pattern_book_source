package zhushen.com.shejimoshi.chapter12.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Zhushen on 2018/5/12.
 */
public class Coder implements Observer {
    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hi," + name + ",update message :" + arg);
    }

    @Override
    public String toString() {
        return "name :" + name;
    }
}
