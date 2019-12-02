package com.liu.commonbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.liu.commonbox.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MainActivity : BaseActivity() {


    override fun bindLayout(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        //测试
        showToast(R.string.app_name)

        btnShow.setOnClickListener {
            showToast("测试取消")
        }
    }

    override fun initData() {

    }


}
