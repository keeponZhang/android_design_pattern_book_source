package com.wbb.dp.chapter07.v2;

/**
 * 公交车价格计算策略
 *
 * @author vico
 * @date 2018-11-03
 */
public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        //其他距离我们简化为7元
        return 7;
    }
}
