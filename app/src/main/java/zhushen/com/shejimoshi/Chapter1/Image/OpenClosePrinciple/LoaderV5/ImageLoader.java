package zhushen.com.shejimoshi.Chapter1.Image.OpenClosePrinciple.LoaderV5;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Zhenshen on 2017/2/23.
 * 最终版了
 * 这里的cache都继承基本接口并实现方法
 * 这之后要添加新的缓存类型，新建一个类继承接口并实现方法就行了
 */

public class ImageLoader {
    //图片缓存
    ImageCache mInageCache = new MemeryCache();
    //线程池，线程数量为CPU数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors());

    //注入缓存实现
    public void setmInageCache(ImageCache cache){
        mInageCache = cache;
    }

    public void displayImage(String imageUrl, ImageView imageView){
        Bitmap bitmap = mInageCache.get(imageUrl);
        if(bitmap!=null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        //图片没缓存，提交到线程池中下载图片
        submitLoadRequest(imageUrl,imageView);
    }

    private void submitLoadRequest(final String imageUrl, final ImageView imageView) {
        imageView.setTag(imageUrl);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(imageUrl);
                if(bitmap == null){
                    return;
                }
                if(imageView.getTag().equals(imageUrl)){
                    imageView.setImageBitmap(bitmap);
                }
                mInageCache.put(imageUrl,bitmap);
            }
        });
    }

    private Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null ;
        try {
            URL url = new URL(imageUrl);
            final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }
}
