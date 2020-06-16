package com.example.demomvplast.MyDemo;

import com.example.demomvplast.Base.BaseView;

public interface MyView extends BaseView {

    void onSS(ListBean bean);

    void onFail(String msg);
}
