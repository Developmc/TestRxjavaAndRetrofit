package com.clement.example.testrxjavaandretrofit.retrofit_rx.service;

import com.clement.example.testrxjavaandretrofit.retrofit_rx.model.RetrofitEntity;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**服务接口地址
 * Created by clement on 16/11/4.
 */

public interface ApiService {
    @POST("AppFiftyToneGraph/videoLink")
    Observable<RetrofitEntity> getAllVideo(@Body boolean once_on);
}
