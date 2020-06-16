package com.sqw.demomvp.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<p extends BasePresenter,v extends BaseView> extends AppCompatActivity implements BaseView {

    private Unbinder bind;
    protected p presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayoutId());
        bind = ButterKnife.bind(this);
        presenter = initpresenter();
        if (presenter!=null) {
            presenter.bind(this);
        }
        initView();
        initData();
        addListener();

    }

    protected abstract void addListener();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract p initpresenter();

    protected abstract int getlayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }
}
