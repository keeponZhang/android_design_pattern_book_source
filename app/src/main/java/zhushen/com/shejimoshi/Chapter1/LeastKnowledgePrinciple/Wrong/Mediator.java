package zhushen.com.shejimoshi.Chapter1.LeastKnowledgePrinciple.Wrong;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhenshen on 2017/2/28.
 */

public class Mediator {
    List<Room> mRooms = new ArrayList<Room>();

    public Mediator() {
        for(int i = 0;i<5;i++){
            mRooms.add(new Room((14 + i),(14 + i) * 150));
        }
    }

    public List<Room> getmRooms() {
        return mRooms;
    }
}
