package com.example.cw.designpatterndemo.objectOrientedSixPrinciple.java;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by cw on 2018/3/23.
 * 面向对象的六大原则
 * SRP: 单一职责原则
 * OCP: 开闭原则
 * ISP: 接口隔离原则   类间的依赖关系应该建立在最小的接口上
 * LSP: 里氏替换原则   依赖于继承和多态，任何可以使用基线的地方都必须能透明使用子类对象
 * DIP: 依赖倒置原则   特定的解耦形式，高层次的模块不能依赖于低层次模块的具体实现
 * LOD: 迪米特原则     一个对象应该对其他对象有最少的了解
 */

public class ImageLoader {

    private ImageCache mImageCache;

    public void setmImageCache(ImageCache mImageCache) {
        this.mImageCache = mImageCache;
    }

    public void displayImage(String url, ImageView imageView){
        Bitmap bitmap = mImageCache.get(url);
        if (bitmap != null){
            imageView.setImageBitmap(bitmap);
        }else {
            bitmap = downloadImage(url);
            if (bitmap != null){
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    private Bitmap downloadImage(String url){
        Bitmap bitmap = null;
        HttpURLConnection connection;
        try {
            URL downloadURL = new URL(url);
            connection = (HttpURLConnection) downloadURL.openConnection();
            bitmap = BitmapFactory.decodeStream(connection.getInputStream());
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

}
