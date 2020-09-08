package zhushen.com.shejimoshi.chapter15.example;

/**
 * Created by Zhushen on 2018/5/23.
 */
public class MilitaryComputer extends AbsreactComputer {
    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("check firewall");
    }

    @Override
    protected void login() {
        System.out.println("check fingerprint");
    }
}
