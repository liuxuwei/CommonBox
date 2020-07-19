package com.liu.commonbox.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.liu.commonbox.utils.ToastUtils;

import org.greenrobot.eventbus.EventBus;

/**
 * @author liuxuwei
 * Time   2019-11-25  17:21
 * Email  impiziliu@163.com
 * Description BaseActivity基类
 */
@SuppressLint("Registered")
public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        mContext = getApplicationContext();
        initView();
        initData();
        if (bindEvent()) {
            if (!EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().register(this);
            }
        }



    }

    /**
     * EventBus相关
     *
     * @return 是否绑定EventBus
     */
    protected boolean bindEvent() {
        return false;
    }

    /**
     * 获取资源id
     *
     * @return 布局文件id
     */
    protected abstract int bindLayout();

    /**
     * 初始化View相关
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 短时间提示
     * @param msgId 对应R.string.xxx
     */
    public void showToast(int msgId, int gravity) {
        ToastUtils.showShortToast(getApplicationContext(), getApplicationContext().getString(msgId), gravity);
    }

    /**
     * 短时间提示
     * @param msg 需要提示的消息
     */
    public void showToast(String msg, int gravity) {
        ToastUtils.cancelToast();
        ToastUtils.showShortToast(getApplicationContext(), msg, gravity);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
    }
}
