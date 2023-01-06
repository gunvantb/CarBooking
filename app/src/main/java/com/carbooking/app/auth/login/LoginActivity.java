package com.carbooking.app.auth.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.carbooking.app.R;
import com.carbooking.app.databinding.ActivityLoginBinding;
import com.google.android.material.card.MaterialCardView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.setHandler(new ClickHandler());

    }

    public class ClickHandler {

        public void onLoginCardViewClick(View view) {
            /*binding.signupCardView.setCardBackgroundColor(getColor(R.color.card_color));
            binding.signupCardView.setRadius(0);
            binding.signupText.setTextColor(getColor(R.color.intro_text_color));

            binding.loginCardView.setCardBackgroundColor(getColor(R.color.purple_500));
            binding.loginCardView.setRadius(com.auto.adjust.dimensadp.R.dimen._30adp);
            binding.loginText.setTextColor(getColor(R.color.white));

            binding.loginMainLl.setVisibility(View.VISIBLE);
            binding.loginCardViewBtn.setVisibility(View.VISIBLE);

            binding.signUpMainLl.setVisibility(View.GONE);
            binding.signupCardViewBtn.setVisibility(View.GONE);*/

            showHideView(getColor(R.color.purple_500), com.auto.adjust.dimensadp.R.dimen._30adp, getColor(R.color.white),
                    getColor(R.color.card_color), 0, getColor(R.color.intro_text_color),
                    View.VISIBLE, View.VISIBLE, View.GONE, View.GONE);
        }

        public void onSignupCardViewClick(View view) {
            /*binding.loginCardView.setCardBackgroundColor(getColor(R.color.card_color));
            binding.loginCardView.setRadius(0);
            binding.loginText.setTextColor(getColor(R.color.intro_text_color));

            binding.signupCardView.setCardBackgroundColor(getColor(R.color.purple_500));
            binding.signupCardView.setRadius(com.auto.adjust.dimensadp.R.dimen._30adp);
            binding.signupText.setTextColor(getColor(R.color.white));

            binding.loginMainLl.setVisibility(View.GONE);
            binding.loginCardViewBtn.setVisibility(View.GONE);

            binding.signUpMainLl.setVisibility(View.VISIBLE);
            binding.signupCardViewBtn.setVisibility(View.VISIBLE);*/

            showHideView(getColor(R.color.card_color), 0, getColor(R.color.intro_text_color),
                    getColor(R.color.purple_500), com.auto.adjust.dimensadp.R.dimen._30adp, getColor(R.color.white),
                    View.GONE, View.GONE, View.VISIBLE, View.VISIBLE);
        }
    }

    public void showHideView(int loginCardViewColor, float loginCardViewRadius, int loginTextColor,
                             int signupCardViewColor, float signupCardViewRadius, int signupTextColor,
                             int loginMainLlVisibility, int loginCardViewBtnVisibility,
                             int signUpMainLlVisibility, int signupCardViewBtnVisibility) {

        binding.loginCardView.setCardBackgroundColor(loginCardViewColor);
        binding.loginCardView.setRadius(loginCardViewRadius);
        binding.loginText.setTextColor(loginTextColor);

        binding.signupCardView.setCardBackgroundColor(signupCardViewColor);
        binding.signupCardView.setRadius(signupCardViewRadius);
        binding.signupText.setTextColor(signupTextColor);

        binding.loginMainLl.setVisibility(loginMainLlVisibility);
        binding.loginCardViewBtn.setVisibility(loginCardViewBtnVisibility);

        binding.signUpMainLl.setVisibility(signUpMainLlVisibility);
        binding.signupCardViewBtn.setVisibility(signupCardViewBtnVisibility);
    }
}