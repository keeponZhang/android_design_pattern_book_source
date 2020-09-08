package zhushen.com.shejimoshi.chapter8.example.power;

import zhushen.com.shejimoshi.chapter8.example.state.PowerOffState;
import zhushen.com.shejimoshi.chapter8.example.state.PowerOnState;
import zhushen.com.shejimoshi.chapter8.example.state.TVState;

/**
 * Created by Zhushen on 2018/5/8.
 */
public class TvController implements PowerController {
    TVState tvState;

    public void setTvState(TVState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("power on");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("power off");
    }

    public void nextChannel(){
        tvState.nextChannel();
    }

    public void prevChannel(){
        tvState.prevChannel();
    }

    public void turnUp(){
        tvState.turnUp();
    }

    public void turnDown(){
        tvState.turnDown();
    }

}
