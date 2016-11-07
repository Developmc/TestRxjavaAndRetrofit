package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.base;

import android.app.Application;

import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.http.APIFactory;

/**初始化网络请求工具
 * Created by clement on 16/11/7.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化网络请求工具
        APIFactory.getInstance().init(this);
    }
}
