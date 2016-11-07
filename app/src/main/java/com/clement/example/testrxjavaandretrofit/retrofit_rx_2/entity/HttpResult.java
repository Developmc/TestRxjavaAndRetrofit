package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.entity;

import com.clement.example.testrxjavaandretrofit.retrofit_rx_2.util.Constant;

/**通用的HttpResult返回结构体
 * Created by clement on 16/11/5.
 */

public class HttpResult<T>{
    public int ret;
    public String msg;
    //具体数据对象
    public T data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**判断网络请求是否成功
     * @return
     */
    public boolean isSuccess(){
        return ret == Constant.SUCCESS;
    }

    /**判断数据是否为空
     * @return
     */
    public boolean isEmpty(){
        return ret == Constant.EMPTY;
    }

    /**是否没有更多数据了
     * @return
     */
    public boolean isNoMore(){
        return ret == Constant.NO_MORE;
    }

}
