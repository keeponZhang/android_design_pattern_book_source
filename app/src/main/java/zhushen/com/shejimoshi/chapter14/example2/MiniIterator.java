package zhushen.com.shejimoshi.chapter14.example2;

import java.util.List;

/**
 * Created by Zhushen on 2018/5/16.
 */
public class MiniIterator implements Iterator {
    private List<Employee> list;
    private int position;

    public MiniIterator(List<Employee> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 ||list.get(position) == null);
    }

    @Override
    public Object next() {
        Employee e = list.get(position);
        position ++;
        return e;
    }
}
