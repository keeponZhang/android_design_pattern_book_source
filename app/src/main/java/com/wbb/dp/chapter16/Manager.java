package com.wbb.dp.chapter16;

import java.util.Random;

/**
 * 经理类型
 * @author vico
 * @date 2018-12-01
 */
public class Manager extends Staff {


    private int products; //产品数量

    public Manager(String aName){
        super(aName);
        products=new Random().nextInt(10);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //一年内做的产品数量
    public int getProducts(){
        return products;
    }
}
