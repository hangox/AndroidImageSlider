package com.hangox.slider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.hangox.slider.SliderTypes.SliderHolder;

import java.util.ArrayList;

/**
 * A slider adapter
 */
public class SliderAdapter extends PagerAdapter{

    private final ImageLoader mImageLoader;
    private Context mContext;
    private ArrayList<SliderHolder> mImageContents;

    public SliderAdapter(Context context, ImageLoader imageLoader){
        mContext = context;
        mImageContents = new ArrayList<>(5);
        mImageLoader = imageLoader;
    }

    public <T extends SliderHolder> void addSlider(T slider){

    }

    public SliderHolder getSliderHolder(int position){
        if(position < 0 || position >= mImageContents.size()){
            return null;
        }else{
            return mImageContents.get(position);
        }
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    public <T extends SliderHolder> void removeSlider(T slider){
        if(mImageContents.contains(slider)){
            mImageContents.remove(slider);
            notifyDataSetChanged();
        }
    }

    public void removeSliderAt(int position){
        if(mImageContents.size() < position){
            mImageContents.remove(position);
            notifyDataSetChanged();
        }
    }

    public void removeAllSliders(){
        mImageContents.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mImageContents.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        SliderHolder  b = mImageContents.get(position);
        View v = b.getView();
        b.bindView(mImageLoader);
        container.addView(v);
        return v;
    }


}
