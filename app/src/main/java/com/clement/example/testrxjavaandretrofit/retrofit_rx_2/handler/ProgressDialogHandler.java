package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.handler;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;

import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.listener.ProgressCancelListener;

/**自定义handler
 * Created by clement on 16/11/7.
 */

public class ProgressDialogHandler extends Handler {
    //显示弹框
    public static final int SHOW_PROGRESS_DIALOG = 1;
    //隐藏弹框
    public static final int DISMISS_PROGRESS_DIALOG = 2;

    private ProgressDialog pd;

    private Context context;
    private boolean cancelable;
    private boolean show;
    private ProgressCancelListener mProgressCancelListener;

    public ProgressDialogHandler(Context context,ProgressCancelListener progressCancelListener,
                                 boolean cancelable,boolean show){
        super();
        this.context = context;
        this.mProgressCancelListener = progressCancelListener;
        this.cancelable = cancelable;
        this.show = show;
    }

    /**
     * 创建并显示
     */
    private void initProgressDialog(){
        if (pd == null) {
            pd = new ProgressDialog(context);

            pd.setCancelable(cancelable);

            if (cancelable) {
                pd.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialogInterface) {
                        mProgressCancelListener.onCancelProgress();
                    }
                });
            }

            if (!pd.isShowing()&&show) {
                pd.show();
            }
        }
    }

    /**
     * 关闭
     */
    private void dismissProgressDialog(){
        if (pd != null) {
            pd.dismiss();
            pd = null;
        }
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case SHOW_PROGRESS_DIALOG:
                initProgressDialog();
                break;
            case DISMISS_PROGRESS_DIALOG:
                dismissProgressDialog();
                break;
        }
    }
}
