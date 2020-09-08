package zhushen.com.shejimoshi.Chapter1.Image.SingleResponsibilityPrinciple.loadV2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Zhenshen on 2017/2/23.
 * cache部分移出去
 * 但感觉图片加载这块肯定会改
 * 还是不太好
 * 图片下载和图片加载也分出来？
 */

public class ImageLoader {
    //图片缓存
    ImageCache mImageCache  = new ImageCache();
    //线程池，线程数量为CPU数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors());

    //加载图片
    public void displayImage(final String url, final ImageView imageView){
        Bitmap bitmap = mImageCache.get(url);
        if(bitmap != null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        imageView.setTag(url);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(url);
                if(bitmap == null){
                    return;
                }
                if(imageView.getTag().equals(url)){
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(url,bitmap);
            }
        });
    }

    private Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
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
