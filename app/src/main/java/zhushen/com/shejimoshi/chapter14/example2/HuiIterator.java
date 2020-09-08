package zhushen.com.shejimoshi.chapter14.example2;

/**
 * Created by Zhushen on 2018/5/16.
 */
public class HuiIterator implements Iterator {
    private Employee[] array;
    private int position;

    public HuiIterator(Employee[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length -1 ||array[position] == null);
    }

    @Override
    public Object next() {
        Employee e = array[position];
        position ++;
        return e;
    }
}
