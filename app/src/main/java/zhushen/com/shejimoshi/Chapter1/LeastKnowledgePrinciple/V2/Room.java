package zhushen.com.shejimoshi.Chapter1.LeastKnowledgePrinciple.V2;

/**
 * Created by Zhenshen on 2017/2/28.
 */

public class Room {
    public float area;
    public float price;

    public Room(float area, float price) {
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", price=" + price +
                '}';
    }
}
