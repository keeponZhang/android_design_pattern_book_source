package zhushen.com.shejimoshi.chapter14.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhushen on 2018/5/16.
 */
public class CompanyMin implements Company {
    private List<Employee> list = new ArrayList<>();

    public CompanyMin() {
        list.add(new Employee("A",10,"male","test"));
        list.add(new Employee("B",20,"female","test"));
        list.add(new Employee("C",30,"male","test"));
        list.add(new Employee("D",40,"female","test"));
    }

    public List<Employee> getList() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MiniIterator(list);
    }
}
