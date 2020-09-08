package zhushen.com.shejimoshi.Chapter4.example2;

/**
 * Created by Zhenshen on 2017/3/14.
 */

public class UserV2 implements Cloneable {
    public int age;
    public String name;
    public String phoneNum;
    public Address address;

    @Override
    protected UserV2 clone(){
        UserV2 user = null;
        try {
            user = (UserV2) super.clone();
        }catch (Exception e ){
            e.printStackTrace();
        }
        return user;
    }
}
