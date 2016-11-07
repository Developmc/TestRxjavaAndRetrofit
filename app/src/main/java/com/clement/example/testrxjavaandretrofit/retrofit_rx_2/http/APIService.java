package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.http;

import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.entity.HttpResult;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.entity.ListDayDiscount;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.entity.Video;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**封装所有的API请求
 * Created by clement on 16/11/5.
 */

public interface APIService {
    @GET("GetDayDiscountList")
    Observable<HttpResult<ListDayDiscount>> getDayDiscount(@Query("param") String param);

    @FormUrlEncoded
    @POST("GetDayDiscountList")
    Observable<HttpResult<ListDayDiscount>> getDayDiscountPost(@Field("param") String param);

    @POST("AppFiftyToneGraph/videoLink")
    Observable<HttpResult<List<Video>>> getAllVideo(@Body boolean once_on);
}
