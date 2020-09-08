package zhushen.com.shejimoshi.Chapter1.Image.OpenClosePrinciple.LoaderV4;


import android.graphics.Bitmap;

/**
 * Created by Zhenshen on 2017/2/23.
 * 这里十分费解啊，为啥缓存的时候，俩地方都放了
 */

public class DoubleCache {
    ImageCache mMemoryCache = new ImageCache();
    DiskCache mDiskCache = new DiskCache();

    //先从内存缓存中获取图片，如果没有，再从SD卡获取
    public Bitmap get(String url){
        Bitmap bitmap = mMemoryCache.get(url);
        if(bitmap == null){
            bitmap = mDiskCache.get(url);
        }
        return  bitmap;
    }

    //将图片缓存到内存和SD卡中
    public void put(String url ,Bitmap bitmap){
        mMemoryCache.put(url,bitmap);
        mDiskCache.put(url,bitmap);
    }

}
