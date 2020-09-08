package zhushen.com.shejimoshi.Chapter3.exampleone;

import android.graphics.Bitmap;
import android.widget.ImageView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Zhenshen on 2017/3/2.
 * 主要问题：暴露的方法太多，很多入口可以修改参数
 */

public class ImageLoader {
    ImageCache mImageCache = new MemeryCache();

    int mLoadingImageId;

    int mLoadingFailedImage;


    ExecutorService mEecutorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors());

    public void displayImage(String imgUrl, ImageView imageView){
        Bitmap bitmap = mImageCache.get(imgUrl);
        if(bitmap!=null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        submitLoaderRequest(imgUrl,imageView);
    }

    public void setmImageCache(ImageCache mImageCache) {
        this.mImageCache = mImageCache;
    }

    public void setmLoadingImageId(int mLoadingImageId) {
        this.mLoadingImageId = mLoadingImageId;
    }

    public void setmLoadingFailedImage(int mLoadingFailedImage) {
        this.mLoadingFailedImage = mLoadingFailedImage;
    }

    public void setThreadCount(int count){
        mEecutorService.shutdown();
        mEecutorService = null;
        mEecutorService = Executors.newFixedThreadPool(count);
    }

    private void submitLoaderRequest(final String imgUrl, final ImageView imageView) {
        imageView.setImageResource(mLoadingImageId);

        imageView.setTag(imgUrl);
        mEecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(imgUrl);
                if(bitmap == null){
                    imageView.setImageResource(mLoadingFailedImage);
                    return;
                }
            }
        });
    }

    private Bitmap downloadImage(String imgUrl) {
        Bitmap bitmap = null;
        return bitmap;
    }

}
