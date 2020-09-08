package zhushen.com.shejimoshi.chapter21.example2;

/**
 * Created by Zhushen on 2018/8/20.
 */
public class Client {
    public static void main(String[] args){
        Person person = new Boy();

        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();

        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
