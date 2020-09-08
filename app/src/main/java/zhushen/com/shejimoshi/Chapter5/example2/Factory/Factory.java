package zhushen.com.shejimoshi.Chapter5.example2.Factory;


import zhushen.com.shejimoshi.Chapter5.example2.Product.Product;

/**
 * Created by Zhenshen on 2017/3/14.
 */

public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
