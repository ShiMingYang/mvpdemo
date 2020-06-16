package com.sqw.demomvp;

import com.sqw.demomvp.Base.BaseModel;
import com.sqw.demomvp.httpUtils.BaseObserver;
import com.sqw.demomvp.httpUtils.HttpUtils;
import com.sqw.demomvp.httpUtils.ResultCallBack;
import com.sqw.demomvp.httpUtils.RxUtils;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class MyModel extends BaseModel {
    public void getData(final ResultCallBack<ListBean> listBeanResultCallBack) {
        Observable<ListBean> listData = HttpUtils.getInstance().getApiserver(MyServer.homeUrl, MyServer.class)
                .listData();

        listData.compose(RxUtils.<ListBean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<ListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                      compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(ListBean listBean) {
                        listBeanResultCallBack.onSuccess(listBean);
                    }
                });
    }
}
