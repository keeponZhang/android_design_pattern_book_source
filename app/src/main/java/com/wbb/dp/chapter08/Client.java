package com.wbb.dp.chapter08;

import com.wbb.dp.chapter08.v2.TvController;

/**
 * @author vico
 * @date 2018-11-05
 */
public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        //设置开机状态
        tvController.powerOn();
        //下一频道
        tvController.nextChannel();
        //调高音量
        tvController.turnUp();
        //设置关机状态
        tvController.powerOff();
        //调高音量，此时不会生效
        tvController.turnUp();
    }
}
