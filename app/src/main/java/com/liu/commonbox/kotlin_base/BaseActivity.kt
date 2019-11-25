package com.liu.commonbox.kotlin_base

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @author liuxuwei
 * Time   2019-11-25  17:22
 * Email  impiziliu@163.com
 * Description kotlin版BaseActivity基类
 */
@SuppressLint("Registered")
class BaseActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onDestroy() {
        super.onDestroy()
    }


}