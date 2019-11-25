package com.liu.commonbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.liu.commonbox.base.BaseActivity

class MainActivity : BaseActivity() {


    override fun bindLayout(): Int = R.layout.activity_main

    override fun initView() {
        //测试
        showToast(R.string.app_name)
    }

    override fun initData() {

    }

}
