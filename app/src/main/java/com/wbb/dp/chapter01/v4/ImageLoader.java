package com.wbb.dp.chapter01.v4;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.wbb.dp.chapter01.v2.ImageCache;
import com.wbb.dp.chapter01.v3.DiskCache;

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
    //双缓存
    DoubleCache mDoubleCache = new DoubleCache();
    //使用SD卡缓存
    boolean isUseDiskCache = false;
    //使用双缓存
    boolean isUseDoubleCache = false;
    //线程池，线程数量为CPU的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.
            getRuntime().availableProcessors());

    public void displayImage(final String url, final ImageView imageView) {
        Bitmap bmp = null;
        if (isUseDoubleCache) {
            bmp = mDoubleCache.get(url);
        } else if (isUseDiskCache) {
            bmp = mDiskCache.get(url);
        } else {
            bmp = mImageCache.get(url);
        }

        if (bmp != null) {
            imageView.setImageBitmap(bmp);
        }
        //没有缓存，则提交给线程池进行异步下载图片
    }

    public void userDiskCache(boolean useDiskCache) {
        isUseDiskCache = useDiskCache;
    }

    public void useDoubleCache(boolean useDoubleCache) {
        isUseDoubleCache = useDoubleCache;
    }
}
