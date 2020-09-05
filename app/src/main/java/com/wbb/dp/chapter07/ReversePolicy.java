package com.wbb.dp.chapter07;

/**
 * 逆序加载策略，即从最后加入队列的请求进行加载
 *
 * @author vico
 * @date 2018-11-04
 */
public class ReversePolicy implements LoadPolicy {

    @Override
    public int compare(BitmapRequest request1, BitmapRequest request2) {
        //注意，Bitmap请求要先执行最晚加入队列的请求，ImageLoader的策略
        return request1.serialNum - request2.serialNum;
    }
}
