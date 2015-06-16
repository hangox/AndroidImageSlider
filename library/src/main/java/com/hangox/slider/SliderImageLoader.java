package com.hangox.slider;

import android.view.View;

import com.hangox.slider.SliderTypes.SliderHolder;

/**
 * Created With Android Studio
 * User 47
 * Date 15/4/29
 * Time 下午10:40
 * 图像加载器
 */
public interface SliderImageLoader {
    void display(String url, View view, SliderHolder.ScaleType scaleType, SliderHolder sliderHolder);
}
