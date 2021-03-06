package zhushen.com.shejimoshi.Chapter1.Image.OpenClosePrinciple.LoaderV4;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by Zhenshen on 2017/2/23.
 * Cache部分放出来了
 * 感觉这部分修改不会很大
 */
public class ImageCache {
    //图片LRU缓存
    LruCache<String,Bitmap> mImageCache;

    public ImageCache() {
        initImageCache();
    }

    private void initImageCache() {
        //计算可使用的最大内存
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        //取四分之一的可用内存作为缓存
        final int cacheSize = maxMemory / 4 ;
        mImageCache = new LruCache<String,Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight() / 1024 ;
            }
        };
    }

    public void put(String url,Bitmap bitmap){
        mImageCache.put(url, bitmap);
    }

    public Bitmap get(String url){
        return mImageCache.get(url);
    }
}
