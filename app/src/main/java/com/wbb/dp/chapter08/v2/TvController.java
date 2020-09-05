package com.wbb.dp.chapter08.v2;

import com.wbb.dp.chapter08.PowerController;
import com.wbb.dp.chapter08.PowerOffState;
import com.wbb.dp.chapter08.PowerOnState;
import com.wbb.dp.chapter08.TvState;

/**
 * @author vico
 * @date 2018-11-05
 */
public class TvController implements PowerController {

    TvState mTvState;

    public void setTvState(TvState tvState) {
        mTvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机啦");
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
