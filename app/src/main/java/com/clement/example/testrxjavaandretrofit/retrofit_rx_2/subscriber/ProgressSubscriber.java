package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.subscriber;

import android.content.Context;

import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.handler.ProgressDialogHandler;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.listener.ProgressCancelListener;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.listener.SubscriberOnNextListener;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.util.APIException;
import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.util.Constant;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

/**用于在Http请求开始时，自动显示一个ProgressDialog
 * 在Http请求结束是，关闭ProgressDialog
 * 调用者自己对请求数据进行处理
 * Created by clement on 16/11/7.
 */

public class ProgressSubscriber<T> extends BaseSubscriber<T> implements ProgressCancelListener{
    private SubscriberOnNextListener mSubscriberOnNextListener ;
    private ProgressDialogHandler mProgressDialogHandler ;
    private Context mContext;

    public ProgressSubscriber(Context context,boolean show){
        this.mContext = context ;
        mProgressDialogHandler = new ProgressDialogHandler(context,this,true,show);
    }

    public ProgressSubscriber(SubscriberOnNextListener mSubscriberOnNextListener,Context context,boolean show){
        this.mSubscriberOnNextListener = mSubscriberOnNextListener;
        this.mContext = context ;
        mProgressDialogHandler = new ProgressDialogHandler(context,this,true,show);
    }

    private void showProgressDialog(){
        if (mProgressDialogHandler != null) {
            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.SHOW_PROGRESS_DIALOG).sendToTarget();
        }
    }

    private void dismissProgressDialog(){
        if (mProgressDialogHandler != null) {
            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.DISMISS_PROGRESS_DIALOG).sendToTarget();
            mProgressDialogHandler = null;
        }
    }

    /**
     * 订阅开始时,显示弹框
     */
    @Override
    public void onStart() {
        super.onStart();
        showProgressDialog();
    }

    /**
     * 完成后,隐藏弹框
     */
    @Override
    public void onCompleted() {
        super.onCompleted();
        dismissProgressDialog();
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);
        if (e instanceof SocketTimeoutException) {
            if (mSubscriberOnNextListener != null) {
                mSubscriberOnNextListener.onError(Constant.NET_ERROR,"网络中断，请检查您的网络状态");
            }
        } else if (e instanceof ConnectException) {
            if (mSubscriberOnNextListener != null) {
                mSubscriberOnNextListener.onError(Constant.NET_ERROR,"网络中断，请检查您的网络状态");
            }
        } else if(e instanceof APIException){
            if (mSubscriberOnNextListener != null) {
                mSubscriberOnNextListener.onError(((APIException) e).getCode(),((APIException) e).getMessage());
            }
        }else{
            if (mSubscriberOnNextListener != null) {
                mSubscriberOnNextListener.onError(Constant.UNKOWN_ERROR,e.getMessage());
            }
        }
        //隐藏弹框
        dismissProgressDialog();
    }

    /**将onNext方法中的返回结果交给Activity或Fragment自己处理(也可以在activity中重写onNext)
     * @param t
     */
    @Override
    public void onNext(T t) {
        super.onNext(t);
        if (mSubscriberOnNextListener != null) {
            mSubscriberOnNextListener.onNext(t);
        }
    }

    /**
     * 弹框弹出后,点击取消,则取消订阅,取消请求
     */
    @Override
    public void onCancelProgress() {
        if(!this.isUnsubscribed()){
            this.unsubscribe();
        }
    }
}
