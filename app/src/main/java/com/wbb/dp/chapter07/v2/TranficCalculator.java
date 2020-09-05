package com.wbb.dp.chapter07.v2;

/**
 * 公交出行价格计算器
 *
 * @author vico
 * @date 2018-11-03
 */
public class TranficCalculator {
    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        //设置计算策略
        calculator.setStrategy(new BusStrategy());
        //计算价格
        System.out.println("公交车乘16公里的价格 ：" + calculator.calculatePrice(16));
    }

    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy strategy) {
        mStrategy = strategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
