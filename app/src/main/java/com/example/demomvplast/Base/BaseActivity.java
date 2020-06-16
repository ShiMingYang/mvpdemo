package com.example.demomvplast.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity<p extends BasePresenter,v extends BaseView> extends AppCompatActivity implements BaseView{

    protected p basePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayout());
        ButterKnife.bind(this);
        basePresenter = initPresenter();
        if (basePresenter!=null) {
            basePresenter.bind((v)this);
        }
        initView();
        initData();
    }

    protected abstract void initView();

    protected abstract void initData();

    protected abstract int getlayout();

    protected abstract p initPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePresenter.OnDestroy();
    }
}
