package zhushen.com.shejimoshi.chapter14.example1;

/**
 * Created by Zhushen on 2018/5/16.
 */
public interface Aggreate<T> {
    void add(T obj);
    void remove(T obj);
    Iterator<T> iterator();
}
