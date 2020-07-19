package com.liu.commonbox

import android.view.Gravity
import com.liu.commonbox.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun bindLayout(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        //测试
        showToast(R.string.app_name, Gravity.CENTER)

        btnShow.setOnClickListener {
            showToast("测试取消", Gravity.TOP)
        }
    }

    override fun initData() {

    }


}
