package zhushen.com.shejimoshi.Chapter5.example2.Factory;


import zhushen.com.shejimoshi.Chapter5.example2.Product.ConcreteProductA;
import zhushen.com.shejimoshi.Chapter5.example2.Product.Product;

/**
 * Created by Zhenshen on 2017/3/14.
 * 这里只生产A，其实可以新建B工厂来生产B或者优化这个类
 */

public class ConcreteFactory extends Factory {
    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
