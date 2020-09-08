package zhushen.com.shejimoshi.chapter14.example2;

/**
 * Created by Zhushen on 2018/5/16.
 */
public class CompanyHui implements Company {
    private Employee[] array = new Employee[3];

    public CompanyHui() {
        array[0] = new Employee("a",25,"male","test");
        array[1] = new Employee("b",35,"male","test");
        array[2] = new Employee("c",45,"male","test");
    }

    public Employee[] getArray() {
        return array;
    }

    @Override
    public Iterator iterator() {
        return new HuiIterator(array);
    }
}
