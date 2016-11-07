package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.subscriber;

import rx.Subscriber;

/**自定义订阅者:Subscriber
 * Created by clement on 16/11/7.
 */

public class BaseSubscriber<T> extends Subscriber<T> {
    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onNext(T t) {

    }
}
