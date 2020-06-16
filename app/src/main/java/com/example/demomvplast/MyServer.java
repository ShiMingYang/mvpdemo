package com.example.demomvplast;


import com.example.demomvplast.MyDemo.BannerBean;
import com.example.demomvplast.MyDemo.ListBean;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Dell on 2019/4/28.
 */

public interface MyServer {



     String homeUrl="https://www.wanandroid.com/";

    @GET("banner/json")
    Observable<BannerBean> banData();

    @GET("article/list/0/json")
    Observable<ListBean> listData();

//顶部每日一句
    // https://test.yaofun.vip/api/mood/one

    String  demeurl="https://test.yaofun.vip/api/";
    @GET("mood/one")
    Observable<DayBeansss> getDayData(@QueryMap HashMap<String, Object> map);





}
