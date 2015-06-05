package com.daimajia.slider.library.SliderTypes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.slider.library.ImageLoader;
import com.daimajia.slider.library.R;

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
    public void bindView(ImageLoader mImageLoader) {
        ImageView target = (ImageView)getView().findViewById(R.id.daimajia_slider_image);
        mImageLoader.display(getUrl(),target,getScaleType());
    }
}
