package com.wbb.dp.chapter07.v2;

/**
 * 计算接口
 * @author vico
 * @date 2018-11-03
 */
public interface CalculateStrategy {
    /**
     * 按距离来计算价格
     * @param km
     * @return
     */
    int calculatePrice(int km);
}
