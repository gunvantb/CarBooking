package com.carbooking.app.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.carbooking.app.R;

import es.dmoral.toasty.Toasty;

public class Utils {
    private static ProgressDialog progressDialog;


    public static void showProgressDialog(Context context) {
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

    public static void dismissProgressDialog() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public static void showFancyToast(final Context context, final String type, final String message) {
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
}
