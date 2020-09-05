package com.wbb.dp.chapter01.v3;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.wbb.dp.chapter01.v2.ImageCache;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by vico on 2018-05-28.
 */

public class ImageLoader {
    //内存缓存
    ImageCache mImageCache = new ImageCache();
    //SD卡缓存
    DiskCache mDiskCache = new DiskCache();
    //是否使用SD卡缓存
    boolean isUserDiskCache = false;
    //线程池，线程数量为CPU的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.
            getRuntime().availableProcessors());

    public void displayImage(final String url, final ImageView imageView) {
        //判断使用哪种缓存
        Bitmap bitmap = isUserDiskCache ? mDiskCache.get(url) : mImageCache.get(url);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        //没有缓存则提交给线程池进行下载
    }

    public void useDiskCache(boolean useDiskCache) {
        isUserDiskCache = useDiskCache;
    }
}
