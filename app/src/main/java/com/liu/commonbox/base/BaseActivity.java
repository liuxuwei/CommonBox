package com.liu.commonbox.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author liuxuwei
 * Time   2019-11-25  17:21
 * Email  impiziliu@163.com
 * Description BaseActivity基类
 */
@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    protected Context mContext;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
