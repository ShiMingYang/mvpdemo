package com.sqw.demomvp;



import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Dell on 2019/4/28.
 */

public interface MyServer {



     String homeUrl="https://www.wanandroid.com/";

//    @GET("banner/json")
//    Observable<BannerBean> banData();

    @GET("article/list/0/json")
    Observable<ListBean> listData();







}
