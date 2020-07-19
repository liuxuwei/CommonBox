package com.liu.commonbox

import android.view.Gravity
import com.liu.commonbox.base.BaseActivity
import com.liu.commonbox.internet.AppService
import com.liu.commonbox.internet.RetrofitManager
import com.liu.commonbox.utils.LogUtils
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.ResponseBody
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {


    override fun bindLayout(): Int {
        return R.layout.activity_main
    }

    /**
     * 是否要发送EventBus消息
     */
    override fun bindEvent(): Boolean = true


    @Subscribe(threadMode = ThreadMode.MAIN)
    fun receiveSth(str: String) {
        LogUtils.d("收到: $str")
    }

    override fun initView() {
        //测试
        showToast(R.string.app_name, Gravity.CENTER)

        btnShow.setOnClickListener {
            showToast("测试取消", Gravity.TOP)
            EventBus.getDefault().post("发送的消息")
            RetrofitManager.getRetrofit()
                .create(AppService::class.java)
                .getPoem("f8b5ca5d56b864e9c2c97dc6c144773f")
                .enqueue(object : Callback<ResponseBody> {
                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                        LogUtils.e("onError")
                        LogUtils.e(t.message)
                    }

                    override fun onResponse(
                        call: Call<ResponseBody>,
                        response: Response<ResponseBody>
                    ) {
                        LogUtils.d("onResponse")
                        LogUtils.d(response.body()?.string())
                    }

                })
        }


    }

    override fun initData() {

    }


}
