package zhushen.com.shejimoshi.Chapter3.exampleone;

import android.graphics.Bitmap;

/**
 * Created by Zhenshen on 2017/2/23.
 */

public interface ImageCache {
    public Bitmap get(String url);
    public void put(String url, Bitmap bitmap);
}
