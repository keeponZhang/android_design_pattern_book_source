package zhushen.com.shejimoshi.Chapter5.example2;


import zhushen.com.shejimoshi.Chapter5.example2.Factory.ConcreteFactory;
import zhushen.com.shejimoshi.Chapter5.example2.Factory.Factory;
import zhushen.com.shejimoshi.Chapter5.example2.Product.ConcreteProductB;
import zhushen.com.shejimoshi.Chapter5.example2.Product.Product;

/**
 * Created by Zhenshen on 2017/3/14.
 */

public class Client {

    public void method(){
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProductB.class);
        product.method();
    }
}
