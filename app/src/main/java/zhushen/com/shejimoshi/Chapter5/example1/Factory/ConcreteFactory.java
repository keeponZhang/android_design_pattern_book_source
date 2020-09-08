package zhushen.com.shejimoshi.Chapter5.example1.Factory;

import zhushen.com.shejimoshi.Chapter5.example1.Product.ConcreteProductA;
import zhushen.com.shejimoshi.Chapter5.example1.Product.Product;

/**
 * Created by Zhenshen on 2017/3/14.
 * 这里只生产A，其实可以新建B工厂来生产B或者优化这个类
 */

public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return  new ConcreteProductA();
    }
}
