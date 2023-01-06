package com.carbooking.app.intro;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.carbooking.app.R;
import com.carbooking.app.adapter.IntroAdapter;
import com.carbooking.app.auth.login.LoginActivity;
import com.carbooking.app.databinding.ActivityIntroBinding;
import com.carbooking.app.utils.BaseActivity;

public class IntroActivity extends BaseActivity {

    private ActivityIntroBinding binding;
    private IntroAdapter introAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.setHandler(new ClickHandler());

        introAdapter = new IntroAdapter(IntroActivity.this);
        binding.viewPager.setAdapter(introAdapter);
        binding.indicatorView.setupWithViewPager(binding.viewPager);

        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position == introAdapter.getCount() - 1) {

                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public class ClickHandler {

        public void onNextClick(View view) {
            if(binding.viewPager.getCurrentItem() == 2) {
                startActivity(new Intent(IntroActivity.this, LoginActivity.class));
                finish();
            }
            if (binding.viewPager.getCurrentItem() < introAdapter.getCount()) {
                binding.viewPager.setCurrentItem(binding.viewPager.getCurrentItem() + 1);
            }
        }
    }
}