package com.liu.commonbox.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

/**
 * @author liuxuwei
 * Time   2019-11-25  19:15
 * Email  impiziliu@163.com
 * Description Toast工具类
 * todo 需要扩展的地方：设置Toast显示的位置（底部、中间、顶部）
 */
@SuppressWarnings("unused")
@SuppressLint("ShowToast")
public class ToastUtils {
    private static Toast toast;


    public static void showShortToast(Context context, String msg, int gravity) {
        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.setGravity(gravity, 0, 0);
        toast.show();
    }

    public static void showLongToast(Context context, String msg, int gravity) {
        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        } else {
            toast.setText(msg);
        }
        toast.setGravity(gravity, 0, 0);
        toast.show();
    }


    public static void showLongToast(Context context, int msgId, int gravity) {
        if (toast == null) {
            toast = Toast.makeText(context, msgId, Toast.LENGTH_LONG);
        } else {
            toast.setText(msgId);
        }
        toast.setGravity(gravity, 0, 0);
        toast.show();
    }

    public static void cancelToast() {
        if (toast != null) {
            toast.cancel();
            toast = null;
        }
    }

}
