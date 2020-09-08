package zhushen.com.shejimoshi.chapter8.example;

import zhushen.com.shejimoshi.chapter8.example.power.TvController;

/**
 * Created by Zhushen on 2018/5/8.
 */
public class Client {
    public static void main(String[] args){
        TvController tvController = new TvController();

        tvController.powerOn();

        tvController.nextChannel();

        tvController.prevChannel();

        tvController.turnUp();

        tvController.turnDown();

        tvController.powerOff();

    }
}
