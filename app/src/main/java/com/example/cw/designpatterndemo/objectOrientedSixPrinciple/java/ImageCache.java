package com.example.cw.designpatterndemo.objectOrientedSixPrinciple.java;

import android.graphics.Bitmap;

/**
 * Created by cw on 2018/3/23.
 */

public interface ImageCache {

    void put(String url, Bitmap bitmap);

    Bitmap get(String url);

}
