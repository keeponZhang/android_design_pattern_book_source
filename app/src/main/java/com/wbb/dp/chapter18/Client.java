package com.wbb.dp.chapter18;

import java.lang.reflect.Proxy;

/**
 * @author vico
 * @date 2018-12-03
 */
public class Client {
    public static void main(String[] args) {
        ILawsuit xiaomin=new XiaoMin();

        //构造一个动态代理
        DynamicProxy proxy=new DynamicProxy(xiaomin);

        //获取被代理类小民的ClassLoader
        ClassLoader loader=xiaomin.getClass().getClassLoader();

        //动态构造以一个代理者律师
        ILawsuit lawyer= (ILawsuit) Proxy.newProxyInstance(loader,new Class[]{ILawsuit.class},proxy);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
