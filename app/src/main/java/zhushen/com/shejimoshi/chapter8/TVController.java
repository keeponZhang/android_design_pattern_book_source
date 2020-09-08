package zhushen.com.shejimoshi.chapter8;

/**
 * Created by Zhushen on 2018/5/8.
 */
public class TVController {
    private final static int POWER_ON = 1;
    private final static int POWER_OFF =2;

    private int mState = POWER_OFF;

    public void PowerOn(){
        if(mState == POWER_OFF){
            System.out.println("power on");
        }
        mState = POWER_ON;
    }

    public void PowerOff(){
        if(mState == POWER_ON){
            System.out.println("power on");
        }
        mState = POWER_OFF;
    }

    public void nextChannel(){
        if(mState == POWER_ON){
            System.out.println("next channel");
        }else {
            System.out.println("no power");
        }
    }

    public void prevChannel(){
        if(mState == POWER_ON){
            System.out.println("prev channel");
        }else {
            System.out.println("no power");
        }
    }

    public void turnUp(){
        if(mState == POWER_ON){
            System.out.println("turn up");
        }else {
            System.out.println("no power");
        }
    }

    public void turnDown(){
        if(mState == POWER_ON){
            System.out.println("turn down");
        }else {
            System.out.println("no power");
        }
    }
}
