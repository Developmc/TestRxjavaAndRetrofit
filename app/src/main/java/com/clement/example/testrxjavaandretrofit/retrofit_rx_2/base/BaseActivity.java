package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.base;

import android.support.v7.app.AppCompatActivity;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**baseActivity
 * 参考博客:http://www.jianshu.com/p/566912926427/comments/3660576
 * Created by clement on 16/11/7.
 */

public class BaseActivity extends AppCompatActivity {
    private CompositeSubscription mCompositeSubscription;
    public CompositeSubscription getCompositeSubscription(){
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }
        return this.mCompositeSubscription;
    }
    public void addSubscription(Subscription s) {
        if (this.mCompositeSubscription == null) {
            this.mCompositeSubscription = new CompositeSubscription();
        }

        this.mCompositeSubscription.add(s);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        //RxJava取消注册,避免内存泄露
        if (this.mCompositeSubscription != null) {
            this.mCompositeSubscription.unsubscribe();
        }
    }
}
