package com.liu.commonbox.internet;

import androidx.annotation.Nullable;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AppService {

    @GET("/dream/category")
    Call<ResponseBody> getPoem(@Query("key") String key);
}
