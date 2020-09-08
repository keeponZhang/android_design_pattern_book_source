package zhushen.com.shejimoshi.Chapter3.exampleone;

import android.graphics.Bitmap;

/**
 * Created by Zhenshen on 2017/2/23.
 */

public class DoubleCache implements ImageCache {
    ImageCache mMemoryCache = new MemeryCache();
    ImageCache mDiskCache = new DiskCache();

    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if(bitmap == null){
            bitmap = mDiskCache.get(url);
        }
        return bitmap;
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mDiskCache.put(url,bitmap);
        mMemoryCache.put(url,bitmap);

    }
}
