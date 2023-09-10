package com.testzinity.toasty;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void simpleToast(Context context, String msg) {
        Toast.makeText(context.getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
}
