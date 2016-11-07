package com.clement.example.testrxjavaandretrofit.retrofit_rx.http;

/**单例封装
 * Created by clement on 16/11/4.
 */

public class HttpManager {
    private volatile static HttpManager INSTANCE ;

    /**
     * 私有构造函数
     */
    private HttpManager(){
    }

    /**获取单例
     * @return INSTANCE
     */
    public static HttpManager getInstance(){
        if(INSTANCE==null){
            synchronized (HttpManager.class){
                if(INSTANCE==null){
                    INSTANCE = new HttpManager();
                }
            }
        }
        return INSTANCE ;
    }

    public void doHttpDeal(){

    }

}
