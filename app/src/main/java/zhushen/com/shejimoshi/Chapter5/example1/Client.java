package zhushen.com.shejimoshi.Chapter5.example1;

import zhushen.com.shejimoshi.Chapter5.example1.Factory.ConcreteFactory;
import zhushen.com.shejimoshi.Chapter5.example1.Factory.Factory;
import zhushen.com.shejimoshi.Chapter5.example1.Product.Product;

/**
 * Created by Zhenshen on 2017/3/14.
 */

public class Client {

    public void method(){
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();
    }
}
