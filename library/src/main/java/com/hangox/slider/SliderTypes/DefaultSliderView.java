package com.hangox.slider.SliderTypes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.hangox.slider.SliderImageLoader;
import com.hangox.slider.R;


/**
 * a simple slider view, which just show an image. If you want to make your own slider view,
 *
 * just extend BaseSliderView, and implement getView() method.
 */
public class DefaultSliderView extends SimpleSliderHolder{

    public DefaultSliderView(Context context) {
        super(context);
    }

    @Override
    protected View createView() {
        return LayoutInflater.from(getContext()).inflate(R.layout.render_type_default,null);
    }



    @Override
    public void bindView(SliderImageLoader mSliderImageLoader) {
        ImageView target = (ImageView)getView().findViewById(R.id.daimajia_slider_image);
        mSliderImageLoader.display(getUrl(),target,getScaleType(), this);
    }
}
