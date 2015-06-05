package com.daimajia.slider.library;

import android.view.View;

import com.daimajia.slider.library.SliderTypes.SliderHolder;

/**
 * Created With Android Studio
 * User 47
 * Date 15/4/29
 * Time 下午10:40
 * 图像加载器
 */
public interface ImageLoader {
    void display(String url, View view ,SliderHolder.ScaleType scaleType);
}
