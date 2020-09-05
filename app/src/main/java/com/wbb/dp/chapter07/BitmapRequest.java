package com.wbb.dp.chapter07;

import android.support.annotation.NonNull;

/**
 * @author vico
 * @date 2018-11-04
 */
public class BitmapRequest implements Comparable<BitmapRequest> {

    public int serialNum;
    /**
     * 加载策略
     */
    LoadPolicy mLoadPolicy=new SerialPolicy();

    @Override
    public int compareTo(@NonNull BitmapRequest o) {
        //委托给LoadPolicy进行处理，实现按照策略模式
        return mLoadPolicy.compare(this,o);
    }
}
