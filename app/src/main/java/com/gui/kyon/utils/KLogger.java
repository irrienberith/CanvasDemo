package com.gui.kyon.utils;

import android.util.Log;

public class KLogger {
    public static void error(String errorMsg) {
        error(errorMsg, null);
    }

    public static void error(String errorMsg, Throwable throwable) {
        Log.e("Kyon", errorMsg, throwable);
    }

    public static void info(String info) {
        info(info, null);
    }

    public static void info(String info, Throwable throwable) {
        Log.i("Kyon", info, throwable);
    }

    public static void debug(String msg) {
        Log.d("Kyon", msg);
    }
}
