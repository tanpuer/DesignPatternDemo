package com.example.cw.designpatterndemo.objectOrientedSixPrinciple.java;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by cw on 2018/3/23.
 */

public class MemoryCache implements ImageCache {

    private LruCache<String, Bitmap> mLruCache;



    @Override
    public void put(String url, Bitmap bitmap) {

    }

    @Override
    public Bitmap get(String url) {
        return null;
    }
}
