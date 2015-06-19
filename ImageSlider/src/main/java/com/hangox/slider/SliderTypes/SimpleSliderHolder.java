package com.hangox.slider.SliderTypes;

import android.content.Context;
import android.view.View;

import com.hangox.slider.R;


/**
 * Created With Android Studio
 * User hangox
 * Date 15/4/30
 * Time 下午2:49
 * 只要你设置ProgressBar的ID为loading_bar 就可以自动的现实和隐藏
 */
public abstract class SimpleSliderHolder extends SliderHolder{


    protected SimpleSliderHolder(Context context) {
        super(context);
    }


    @Override
    public void onLoadingComplected() {
        View progressbar = getView().findViewById(R.id.loading_bar);
        if (progressbar != null) progressbar.setVisibility(View.GONE);
    }

    @Override
    public void onLoadingStart() {
        View progressbar = getView().findViewById(R.id.loading_bar);
        if(progressbar != null) progressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onLoadingError() {

    }

    @Override
    public void onLoadingSuccess() {

    }
}
