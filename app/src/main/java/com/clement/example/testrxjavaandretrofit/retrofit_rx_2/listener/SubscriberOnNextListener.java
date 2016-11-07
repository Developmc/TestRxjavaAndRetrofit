package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.listener;

/**
 * Created by clement on 16/11/7.
 */

public interface SubscriberOnNextListener<T> {
    void onNext(T t);
    void onError(int code,String message);
}
