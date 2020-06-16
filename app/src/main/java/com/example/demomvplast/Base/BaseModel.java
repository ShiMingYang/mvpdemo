package com.example.demomvplast.Base;

import io.reactivex.disposables.CompositeDisposable;

public class BaseModel {
    protected  CompositeDisposable compositeDisposable = new CompositeDisposable();
    public void onDestory() {
        compositeDisposable.clear();
    }
}
