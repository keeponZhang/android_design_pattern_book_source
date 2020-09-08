package zhushen.com.shejimoshi.chapter14.example1;

/**
 * Created by Zhushen on 2018/5/16.
 */
public class Client {
    public static void main(String[] args){
        Aggreate<String> a = new ConcreteAggreate<>();
        a.add("String 1");
        a.add("String 2");
        a.add("String 3");
        a.add("String 4");
        a.add("String 5");
        Iterator<String> i = a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
