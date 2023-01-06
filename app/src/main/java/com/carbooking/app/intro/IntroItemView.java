package com.carbooking.app.intro;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;

import com.carbooking.app.R;
import com.carbooking.app.databinding.IntroItemOneBinding;
import com.carbooking.app.databinding.IntroItemThreeBinding;
import com.carbooking.app.databinding.IntroItemTwoBinding;
import com.carbooking.app.utils.BaseActivity;

public class IntroItemView {

    private IntroItemOneBinding introItemOneBinding;
    private IntroItemTwoBinding introItemTwoBinding;
    private IntroItemThreeBinding introItemThreeBinding;

    public View IntroViewOne(BaseActivity context, ViewGroup collection) {

        introItemOneBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.intro_item_one, collection, false);

        return introItemOneBinding.getRoot();
    }

    public View IntroViewTwo(BaseActivity context, ViewGroup collection) {

        introItemTwoBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.intro_item_two, collection, false);

        return introItemTwoBinding.getRoot();
    }

    public View IntroViewThree(BaseActivity context, ViewGroup collection) {

        introItemThreeBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.intro_item_three, collection, false);

        return introItemThreeBinding.getRoot();
    }

}
