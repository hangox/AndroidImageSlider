package com.hangox.slider.SliderTypes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.hangox.slider.SliderImageLoader;
import com.hangox.slider.R;


/**
 * This is a slider with a description TextView.
 */
public class TextSliderView extends SimpleSliderHolder{
    public TextSliderView(Context context) {
        super(context);
    }

    @Override
    protected View createView() {
        return  LayoutInflater.from(getContext()).inflate(R.layout.render_type_text,null);
    }

    @Override
    public void onLoadingError() {

    }

    @Override
    public void onLoadingSuccess() {

    }


    @Override
    public void bindView(SliderImageLoader mSliderImageLoader) {
        View v = getView();
        TextView description = (TextView)v.findViewById(R.id.description);
        description.setText(getDescription());
        mSliderImageLoader.display(getUrl(),v.findViewById(R.id.daimajia_slider_image),
                getScaleType(),this);
    }
}
