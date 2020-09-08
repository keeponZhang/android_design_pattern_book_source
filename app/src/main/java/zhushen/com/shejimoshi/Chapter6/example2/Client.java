package zhushen.com.shejimoshi.Chapter6.example2;

import android.media.MediaPlayer;

import zhushen.com.shejimoshi.Chapter6.example2.factory.CarFactory;
import zhushen.com.shejimoshi.Chapter6.example2.factory.Q3Factory;
import zhushen.com.shejimoshi.Chapter6.example2.factory.Q7Factory;

/**
 * Created by Zhushen on 2018/5/4.
 */
public class Client {
    public static void main(String[] args){
        CarFactory factoryQ3 = new Q3Factory();
        factoryQ3.createTire().tire();
        factoryQ3.createEngine().engine();
        factoryQ3.createBrake().brake();

        System.out.println("-----------------------------------");

        CarFactory factoryQ7 = new Q7Factory();
        factoryQ7.createTire().tire();
        factoryQ7.createEngine().engine();
        factoryQ7.createBrake().brake();
    }
}
