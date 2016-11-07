package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.http;

import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.entity.ListDayDiscount;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.entity.Video;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.subscriber.BaseSubscriber;

import java.util.List;

import rx.Observable;

/**工厂类
 * Created by clement on 16/11/7.
 */

public class APIFactory extends RetrofitHttpUtil {

    private static class SingletonHolder {
        private static final APIFactory INSTANCE = new APIFactory() ;
    }
    public static APIFactory getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**在activity/fragment中调用
     * @param subscriber
     * @param param
     */
    public void getDayDiscount(BaseSubscriber<ListDayDiscount> subscriber,String param){
        //创建观察者
        Observable observable = getApiService().getDayDiscount(param)
                .map(new HttpResultFunc<ListDayDiscount>()) ;
        //订阅
        toSubscribe(observable,subscriber);
    }

    public void getAllVideo(BaseSubscriber<List<Video>> subscriber, boolean param){
        //创建观察者
        Observable observable = getApiService().getAllVideo(param)
                .map(new HttpResultFunc<List<Video>>()) ;
        //订阅
        toSubscribe(observable,subscriber);
    }
}
