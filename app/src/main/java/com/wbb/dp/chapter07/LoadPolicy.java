package com.wbb.dp.chapter07;

/**
 * 加载策略接口
 *
 * @author vico
 * @date 2018-11-04
 */
public interface LoadPolicy {
    public int compare(BitmapRequest request1, BitmapRequest request2);
}
