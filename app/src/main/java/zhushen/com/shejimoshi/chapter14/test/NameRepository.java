package zhushen.com.shejimoshi.chapter14.test;

/**
 * Created by Zhushen on 2018/5/25.
 */
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
//        return new NameIterator(names);
        return new test();
    }

    class test implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
