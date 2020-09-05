package com.wbb.dp.chapter07;

/**
 * 顺序加载策略
 *
 * @author vico
 * @date 2018-11-04
 */
public class SerialPolicy implements LoadPolicy {

    @Override
    public int compare(BitmapRequest request1, BitmapRequest request2) {
        //按照添加到队列的序号列顺序来执行
        return request1.serialNum - request2.serialNum;
    }
}
