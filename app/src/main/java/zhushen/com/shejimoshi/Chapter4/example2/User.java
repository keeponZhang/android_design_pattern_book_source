package zhushen.com.shejimoshi.Chapter4.example2;

/**
 * Created by Zhenshen on 2017/3/14.
 */

public class User {
    public int age;
    public String name;
    public String phoneNum;
    public Address address;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", address=" + address +
                '}';
    }
}
