package com.wbb.dp.chapter01.v5;

import android.graphics.Bitmap;

/**
 * SD卡缓存DiskCache类
 * Created by vico on 2018-05-28.
 */

public class DiskCache implements ImageCache{

    @Override
    public Bitmap get(String url) {
        return null;/* 从本地文件中获取图片 */
    }

    @Override
    public void put(String url, Bitmap bmp) {
        //将Bitmap写入文件中
    }
}
