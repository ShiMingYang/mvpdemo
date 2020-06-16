package com.example.demomvplast.MyDemo;


import android.util.Log;

import com.example.demomvplast.Base.BaseModel;
import com.example.demomvplast.MyServer;
import com.example.demomvplast.httpUtils.BaseObserver;
import com.example.demomvplast.httpUtils.HttpUtils;
import com.example.demomvplast.httpUtils.ResultCallBack;
import com.example.demomvplast.httpUtils.RxUtils;

import io.reactivex.disposables.Disposable;

public class MyModel extends BaseModel {

    public void GetData(final ResultCallBack<ListBean> listBeanResultCallBack) {
/*
        Retrofit retrofit = new Retrofit.Builder().baseUrl(MyServer.homeUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
          retrofit.create(MyServer.class)
                  .listData()
                  .subscribeOn(Schedulers.io())
                  .observeOn(AndroidSchedulers.mainThread())
                  .subscribe(new Observer<ListBean>() {
                      @Override
                      public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                      }

                      @Override
                      public void onNext(ListBean listBean) {
                        listBeanResultCallBack.onSuccess(listBean);
                      }

                      @Override
                      public void onError(Throwable e) {

                      }

                      @Override
                      public void onComplete() {

                      }
                  });*/


        HttpUtils.getInstance()
                .getApiserver(MyServer.homeUrl, MyServer.class)
                .listData()
                .compose(RxUtils.<ListBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<ListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(ListBean listBean) {
                        Log.d("lcze", "onNext: "+listBean.getData().getSize());
                        listBeanResultCallBack.onSuccess(listBean);
                    }
                });
    }
}
