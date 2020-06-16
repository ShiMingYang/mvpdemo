package com.sqw.demomvp.Base;

import io.reactivex.disposables.CompositeDisposable;

public class BaseModel {
    protected CompositeDisposable compositeDisposable = new CompositeDisposable();
    public void onDestory() {
        compositeDisposable.clear();
    }
}
