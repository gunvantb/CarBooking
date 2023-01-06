package com.carbooking.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.carbooking.app.auth.login.LoginActivity;
import com.carbooking.app.databinding.ActivitySplashScreenBinding;
import com.carbooking.app.intro.IntroActivity;
import com.carbooking.app.utils.BaseActivity;

public class SplashScreenActivity extends BaseActivity {

    private ActivitySplashScreenBinding binding;
    private static final int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(SplashScreenActivity.this, IntroActivity.class));
            finish();
        }, SPLASH_TIME_OUT);
    }
}