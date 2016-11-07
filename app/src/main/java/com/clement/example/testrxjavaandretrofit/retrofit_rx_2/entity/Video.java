package com.clement.example.testrxjavaandretrofit.retrofit_rx_2.entity;

/**网络请求回来的实体类
 * Created by clement on 16/11/4.
 */

public class Video {

    /**
     * id : 0
     * name : qianyan.mp4
     * url : https://bj.bcebos.com/course-mct/media/qianyan.mp4?authorization=bce-auth-v1%2Fde89d2e06dd7443a9e4422d5b3fb4eea%2F2016-11-07T03%3A16%3A51Z%2F6000%2F%2F5d6dd28f816447b2492fe8ec201ee2d578dc98f2a690956db976e5ff87e05986
     * title : 前言
     */

    private int id;
    private String name;
    private String url;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
