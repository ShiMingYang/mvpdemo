package com.example.demomvplast.MyDemo;

import android.util.Log;
import android.widget.Toast;

import com.example.demomvplast.Base.BasePresenter;
import com.example.demomvplast.DayBeans;
import com.example.demomvplast.DayBeansss;
import com.example.demomvplast.httpUtils.MyApp;
import com.example.demomvplast.httpUtils.ResultCallBack;

public class MyPresenter extends BasePresenter<MyView> {

    private MyModel myModel;

    @Override
    protected void initModel() {
        myModel = new MyModel();
    }


    public void getData() {
        myModel.GetData(new ResultCallBack<ListBean>() {
            @Override
            public void onSuccess(ListBean bean) {
                if (bean!=null){
                    mView.onSS(bean);
                }
            }

            @Override
            public void onFail(String msg) {
                mView.onFail(msg);
            }
        });
    }
}
