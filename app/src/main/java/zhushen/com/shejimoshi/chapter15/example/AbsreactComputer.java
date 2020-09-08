package zhushen.com.shejimoshi.chapter15.example;

/**
 * Created by Zhushen on 2018/5/23.
 */
public abstract class AbsreactComputer {
    protected void powerOn(){
        System.out.println("power on");
    }

    protected void checkHardware(){
        System.out.println("check hardware");
    }

    protected void loadOS(){
        System.out.println("load OS");
    }

    protected void login(){
        System.out.println("login");
    }

    public final void startUp(){
        System.out.println("-------Start-------");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.out.println("-------End-------");
    }

}
