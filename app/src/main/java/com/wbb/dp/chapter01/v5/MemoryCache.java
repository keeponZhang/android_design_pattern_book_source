package com.wbb.dp.chapter01.v5;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 内存缓存MemoryCache类
 * Created by vico on 2018-05-28.
 */

public class MemoryCache implements ImageCache {
    private LruCache<String, Bitmap> mMemeryCache;

    public MemoryCache() {
        //初始化LRU缓存
    }

    @Override
    public Bitmap get(String url) {
        return mMemeryCache.get(url);
    }

    @Override
    public void put(String url, Bitmap bmp) {
        mMemeryCache.put(url, bmp);
    }
}
