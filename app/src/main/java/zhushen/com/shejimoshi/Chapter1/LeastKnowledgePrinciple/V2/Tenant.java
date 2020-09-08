package zhushen.com.shejimoshi.Chapter1.LeastKnowledgePrinciple.V2;

import android.util.Log;

/**
 * Created by Zhenshen on 2017/3/1.
 */

public class Tenant {
    private String TAG = "Tenant";

    public float roomArea;
    public float roomPrice;
    public static final float diffPrice = 100.0001f;
    public static final float diffArea = 0.00001f;

    public void rentRoom(Mediator mediator){
        Log.d(TAG,"rent room " + mediator.rentOut(roomArea,roomPrice));
    }
}
