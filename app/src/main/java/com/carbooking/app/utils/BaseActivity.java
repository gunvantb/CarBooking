package com.carbooking.app.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.carbooking.app.R;

import es.dmoral.toasty.Toasty;

public class BaseActivity extends AppCompatActivity {
    public static ProgressDialog progressDialog;
    public PreferenceManager preferenceManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        preferenceManager = PreferenceManager.getInstance(BaseActivity.this);

    }

    public void showProgressDialog(Context context) {
        try {
            if (progressDialog != null && progressDialog.isShowing()) {
                dismissProgressDialog();
            }
            progressDialog = new ProgressDialog(context, R.style.MyGravity);
            progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            progressDialog.setCancelable(false);
            progressDialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dismissProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public void showFancyToast(final Context context, final String type, final String message) {
        try {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    switch (type) {
                        case Constants.SUCCESS:
                            Toasty.success(context, message, Toast.LENGTH_LONG, true).show();
                            break;
                        case Constants.INFO:
                            Toasty.info(context, message, Toast.LENGTH_LONG, true).show();
                            break;
                        case Constants.WARNING:
                            Toasty.warning(context, message, Toast.LENGTH_LONG, true).show();
                            break;
                        case Constants.NORMAL:
                            Toasty.normal(context, message, Toast.LENGTH_LONG).show();
                            break;
                        case Constants.ERROR:
                            Toasty.error(context, message, Toast.LENGTH_LONG, true).show();
                            break;
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo;
        try {
            netInfo = cm.getActiveNetworkInfo();
            if (netInfo != null && netInfo.isConnectedOrConnecting()) {
                return true;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
}
