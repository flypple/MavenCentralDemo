package com.example.mylibrary;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by qiqinglin
 * 2021/5/7
 * flypple20088@163.com
 */
public class ToastUtils {
    public static void showToast(Context context, String msg) {
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
