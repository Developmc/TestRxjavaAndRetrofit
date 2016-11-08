package com.clement.example.testrxjavaandretrofit;

import android.os.Bundle;

import com.clement.example.testrxjavaandretrofit.retrofit_rx.model.RetrofitEntity;
import com.clement.example.testrxjavaandretrofit.retrofit_rx.service.ApiService;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.base.BaseActivity;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.entity.Video;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.http.APIFactory;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.subscriber.ProgressSubscriber;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testRetrofit_RX_2();
//        testRetrofit_RX() ;
    }

    private void testRetrofit_RX(){
        String BASE_URL = "http://www.izaodao.com/Api/" ;
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(BASE_URL)
                .build();
        ApiService service = retrofit.create(ApiService.class);
        Observable<RetrofitEntity> observable = service.getAllVideo(true) ;
        observable.subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RetrofitEntity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(RetrofitEntity retrofitEntity) {
                        retrofitEntity = null;
                    }
                });
    }

    private void testRetrofit_RX_2(){
        //1.默认的subscriber
//        Subscriber<List<Video>> subscriber = new Subscriber<List<Video>>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                e.printStackTrace();
//            }
//
//            @Override
//            public void onNext(List<Video> videos) {
//                videos = null;
//            }
//        };


        //2.自定义的BaseSubscriber
//        BaseSubscriber<List<Video>> subscriber = new BaseSubscriber<List<Video>>() {
//            @Override
//            public void onNext(List<Video> videos) {
//                videos = null;
//            }
//        };
//        //发起网络请求
//        APIFactory.getInstance().getAllVideo(subscriber,true);

        //3.有弹框的subscriber
        ProgressSubscriber<List<Video>> subscriber = new ProgressSubscriber<List<Video>>(this,true){
            @Override
            public void onNext(List<Video> videos) {
                videos = null ;
            }
        };
        APIFactory.getInstance().getAllVideo(subscriber,true);
    }
}
