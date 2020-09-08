package zhushen.com.shejimoshi.chapter14.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/5/16.
 */
public class ConcreteAggreate<T> implements Aggreate<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteInterator<T>(list);
    }
}
