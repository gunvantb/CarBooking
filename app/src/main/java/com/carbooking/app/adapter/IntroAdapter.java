package com.carbooking.app.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.carbooking.app.intro.IntroItemView;
import com.carbooking.app.utils.BaseActivity;
import com.zhpan.indicator.IndicatorView;

public class IntroAdapter extends PagerAdapter {
    private BaseActivity mContext;

    public IntroAdapter(BaseActivity context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        View view = null;
        switch (position) {
            case 0:{
                view = new IntroItemView().IntroViewOne(mContext, collection);
                break;
            }
            case 1:{
                view = new IntroItemView().IntroViewTwo(mContext, collection);
                break;
            }
            case 2:{
                view = new IntroItemView().IntroViewThree(mContext, collection);
                break;
            }
        }
        collection.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
