package zhushen.com.shejimoshi.chapter14.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/5/16.
 */
public class ConcreteInterator<T> implements Iterator {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteInterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public Object next() {
        T obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
