package com.liu.commonbox.utils;

import android.util.Log;

/**
 * @author liuxuwei
 * Time   2019-12-02  20:22
 * Email  impiziliu@163.com
 * Description 日志类
 */
@SuppressWarnings("unused")
public class LogUtils {
    private static final String TAG = "LogUtils";
    private static boolean isDebuggable = false;

    public static void d(String msg) {
        if (isDebuggable) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String errorMsg) {
        if (isDebuggable) {
            Log.e(TAG, errorMsg);
        }
    }
}
