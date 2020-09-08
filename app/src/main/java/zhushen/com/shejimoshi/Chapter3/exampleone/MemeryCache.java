package zhushen.com.shejimoshi.Chapter3.exampleone;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by Zhenshen on 2017/2/23.
 */

public class MemeryCache implements ImageCache {

    private LruCache<String,Bitmap> mMemeryCache;

    public MemeryCache() {
        //init
    }

    @Override
    public Bitmap get(String url) {
        return mMemeryCache.get(url);
    }

    @Override
    public void put(String url, Bitmap bitmap) {
        mMemeryCache.put(url,bitmap);
    }
}
