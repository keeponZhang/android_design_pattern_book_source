package zhushen.com.shejimoshi.Chapter4.example2;

/**
 * Created by Zhenshen on 2017/3/14.
 */

public class Address {
    private String city;
    private String district;
    private String street;

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
