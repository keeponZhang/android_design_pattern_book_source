package com.wbb.dp.chapter01.v5;

import android.graphics.Bitmap;

/**
 * 双缓存DoubleCache类
 * Created by vico on 2018-05-28.
 */

public class DoubleCache implements ImageCache {
    ImageCache mMemoryCache = new MemoryCache();
    ImageCache mDiskCache = new DiskCache();

    //先从内存缓存中获取图片，如果没有，再从SD卡中获取
    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if (bitmap == null) {
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    //将图片缓存到内存和SD卡中
    @Override
    public void put(String url, Bitmap bmp) {
        mMemoryCache.put(url, bmp);
        mDiskCache.put(url, bmp);
    }
}
