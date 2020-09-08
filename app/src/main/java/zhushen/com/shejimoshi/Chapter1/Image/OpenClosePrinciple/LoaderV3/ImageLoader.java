package zhushen.com.shejimoshi.Chapter1.Image.OpenClosePrinciple.LoaderV3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by Zhenshen on 2017/2/23.
 */

public class ImageLoader {

    //图片内存缓存
    ImageCache mImageCache  = new ImageCache();
    //图片SD卡缓存
    DiskCache mDiskCache = new DiskCache();
    //是否使用SD卡缓存
    boolean isUserDiskCache = false;
    //线程池，线程数量为CPU数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(
            Runtime.getRuntime().availableProcessors());

    //加载图片
    public void displayImage(final String url, final ImageView imageView){
        //判断使用哪种缓存
        Bitmap bitmap = isUserDiskCache ? mDiskCache.get(url) : mImageCache.get(url);
        if(bitmap != null){
            imageView.setImageBitmap(bitmap);
            return;
        }
        //没有缓存，提交给线程池下载
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

    //外部代码通过这个方法设置用何种缓存
    public void useDiskCache(boolean useDiskCache){
        isUserDiskCache = useDiskCache;
    }
}
