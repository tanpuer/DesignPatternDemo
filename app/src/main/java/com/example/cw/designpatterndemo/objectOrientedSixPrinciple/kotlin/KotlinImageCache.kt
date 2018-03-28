package com.example.cw.designpatterndemo.objectOrientedSixPrinciple.kotlin

import android.graphics.Bitmap

/**
 * Created by cw on 2018/3/23.
 */
interface KotlinImageCache {

    fun get(url: String): Bitmap

    fun set(url: String, bitmap: Bitmap)

}