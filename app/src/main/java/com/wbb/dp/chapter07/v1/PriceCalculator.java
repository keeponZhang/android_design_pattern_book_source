package com.wbb.dp.chapter07.v1;

/**
 * @author vico
 * @date 2018-11-03
 */
public class PriceCalculator {
    //公交车类型
    private static final int BUS = 1;
    //地铁类型
    private static final int SUBWAY = 2;
    //出租车类型
    private static final int TAXI = 3;

    /**
     * 简单计算为每公里2元钱
     */
    private int taxiPrice(int km) {
        return km * 2;
    }

    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("坐16公里的公交车票价为 ：" + calculator.calculatePrice(16, BUS));
        System.out.println("坐16公里的地铁票价为 ：" + calculator.calculatePrice(16, SUBWAY));
    }

    private int busPrice(int km) {
        //超过十公里的总距离
        int extraTotal = km - 10;
        //超过的距离是5公里的倍数
        int extraFactor = extraTotal / 5;
        //超过的距离对5公里取余
        int fraction = extraTotal % 5;
        //计算价格
        int price = 1 + extraFactor;
        return fraction > 0 ? ++price : price;
    }

    private int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        //其他距离我们简化为7元
        return 7;
    }

    private int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else if (type == SUBWAY) {
            return subwayPrice(km);
        } else if (type == TAXI) {
            return taxiPrice(km);
        }
        return 0;
    }
}
