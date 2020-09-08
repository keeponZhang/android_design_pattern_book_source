package zhushen.com.shejimoshi.Chapter1.Image.OpenClosePrinciple.LoaderV3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Zhenshen on 2017/2/23.
 * SD卡缓存
 * 只用内存去缓存会导致重新启动后图片重新下载
 */

public class DiskCache {
    static String cacheDir = "sdcard/cache";

    //从缓存中获取图片
    public Bitmap get(String url){
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    //将图片缓存到内存中
    public void put(String url,Bitmap bmp){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bmp.compress(Bitmap.CompressFormat.PNG,100,fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
