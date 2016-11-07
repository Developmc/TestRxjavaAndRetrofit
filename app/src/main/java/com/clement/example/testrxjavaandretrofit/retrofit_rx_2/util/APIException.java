package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.util;

/**自定义异常,用于处理异常情况
 * Created by clement on 16/11/5.
 */

public class APIException extends RuntimeException {
    //异常情况下的code
    public int code ;
    //异常情况下的信息
    public String message ;

    public APIException(int code,String message){
        this.code = code ;
        this.message = message ;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
