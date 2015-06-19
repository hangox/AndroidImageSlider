package com.hangox.slider.SliderTypes;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.hangox.slider.SliderImageLoader;

/**
 * When you want to make your own slider view, you must extends from this class.
 * BaseSliderView provides some useful methods.
 * I provide two example: {@link DefaultSliderView} and
 * {@link TextSliderView}
 */
public abstract class SliderHolder {

    protected Context mContext;

    private Bundle mBundle;


    private String mUrl;

    protected OnSliderClickListener mOnSliderClickListener;


    private String mDescription;


    /**
     * Scale type of the image.
     */
    private ScaleType mScaleType = ScaleType.Fit;
    private View rootView;

    public enum ScaleType {
        CenterCrop, CenterInside, Fit, FitCenterCrop
    }

    protected SliderHolder(Context context) {
        mContext = context;
        this.mBundle = new Bundle();
    }



    /**
     * the description of a slider image.
     *
     * @param description
     * @return
     */
    public SliderHolder description(String description) {
        mDescription = description;
        return this;
    }

    /**
     * set a url as a image that preparing to load
     *
     * @param url
     * @return
     */
    public SliderHolder image(String url) {
        mUrl = url;
        return this;
    }


    public String getUrl() {
        return mUrl;
    }


    public String getDescription() {
        return mDescription;
    }

    public Context getContext() {
        return mContext;
    }

    /**
     * set a slider image click listener
     *
     * @param l
     * @return
     */
    public SliderHolder setOnSliderClickListener(OnSliderClickListener l) {
        mOnSliderClickListener = l;
        return this;
    }


    private View createViewInternal(Context context){
        rootView = createView();
        return rootView;
    }

    abstract protected View createView();


    abstract public void onLoadingError();

    abstract public void onLoadingSuccess();

    abstract public void onLoadingComplected();

    abstract public void onLoadingStart();


    public SliderHolder setScaleType(ScaleType type) {
        mScaleType = type;
        return this;
    }

    public ScaleType getScaleType() {
        return mScaleType;
    }

    /**
     * the extended class have to implement getView(), which is called by the adapter,
     * every extended class response to render their own view.
     *
     * @return
     */
    public View getView(){
        if(rootView == null) createViewInternal(mContext);
        return rootView;
    }

    abstract public void bindView(SliderImageLoader mSliderImageLoader);


    public interface OnSliderClickListener {
        void onSliderClick(SliderHolder slider);
    }

    /**
     * when you have some extra information, please put it in this bundle.
     *
     * @return
     */
    public Bundle getBundle() {
        return mBundle;
    }


}
