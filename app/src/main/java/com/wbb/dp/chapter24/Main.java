package com.wbb.dp.chapter24;

/**
 * @author weibb
 * @date 2019/1/9
 * email: weibb@chingo.cn
 */
public class Main {
    public static void main(String[] args) {
        //原汁原味
        Ordinary implOrdinary = new Ordinary();

        //准备糖类
        Sugar implSugar = new Sugar();

        //大杯咖啡 原味
        LargeCoffee largeCoffeeOrdinary = new LargeCoffee(implOrdinary);
        largeCoffeeOrdinary.makeCoffee();

        //小杯咖啡 原味
        SmallCoffee smallCoffeeOrdinary = new SmallCoffee(implOrdinary);
        smallCoffeeOrdinary.makeCoffee();

        //大杯咖啡 加糖
        LargeCoffee largeCoffeeSugar = new LargeCoffee(implSugar);
        largeCoffeeSugar.makeCoffee();

        //小杯咖啡 加糖
        SmallCoffee smallCoffeeSugar = new SmallCoffee(implSugar);
        smallCoffeeSugar.makeCoffee();
    }
}
