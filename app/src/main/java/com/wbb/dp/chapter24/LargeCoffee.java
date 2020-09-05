package com.wbb.dp.chapter24;

/**
 * @author weibb
 * @date 2019/1/9
 * email: weibb@chingo.cn
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的"+impl+"咖啡");
    }
}
