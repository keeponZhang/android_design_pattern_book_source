package zhushen.com.shejimoshi.chapter23.example1;

/**
 * Created by Zhushen on 2018/11/22.
 */
public class PhoneImpl implements  Phone {
    @Override
    public void dail() {
        System.out.println("dail");
    }

    @Override
    public void hangup() {
        System.out.println("hangup");
    }
}
