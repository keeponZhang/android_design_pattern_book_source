package zhushen.com.shejimoshi.Chapter1.LeastKnowledgePrinciple.Wrong;

import java.util.List;


/**
 * Created by Zhenshen on 2017/2/28.
 */

public class Tenant {
    public float roomArea;
    public float roomPirce;

    public static final float diffPrice = 100.0001f;
    public static final float diffArea = 0.00001f;

    public void rentRoom(Mediator mediator){
        List<Room> rooms = mediator.getmRooms();
        for (Room room : rooms ) {
            if(isSuitable(room)){
                System.out.println("get" + room);
                break;
            }
        }
    }

    private boolean isSuitable(Room room) {
        return Math.abs(room.price - roomPirce) < diffPrice &&
                Math.abs(room.area - roomArea) <diffArea;
    }
}
