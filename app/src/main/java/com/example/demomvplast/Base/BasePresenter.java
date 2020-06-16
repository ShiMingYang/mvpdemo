package com.example.demomvplast.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BasePresenter<v extends BaseView>{


    protected v mView;
    protected ArrayList<BaseModel> models = new ArrayList<>();

    public void bind(v baseView) {
        WeakReference<v> weakReference = new WeakReference<>(baseView);
        v v = weakReference.get();
        this.mView=v;
    }

    public BasePresenter( ) {
         initModel();
    }

    protected abstract void initModel();

    public void OnDestroy(){
        mView=null;
        for (BaseModel model : models) {
          model.onDestory();
        }
        models.clear();

    }
}
