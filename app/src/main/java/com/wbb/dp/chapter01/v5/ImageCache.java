package com.wbb.dp.chapter01.v5;

import android.graphics.Bitmap;

/**
 * Created by vico on 2018-05-28.
 */

public interface ImageCache {
    public Bitmap get(String url);

    public void put(String url, Bitmap bmp);
}
