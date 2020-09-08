package zhushen.com.shejimoshi.chapter14.test;

/**
 * Created by Zhushen on 2018/5/25.
 */
public class NameIterator implements Iterator {

    int index;

    public String names[];

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        if(index < names.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return names[index++];
        }
        return null;
    }
}
