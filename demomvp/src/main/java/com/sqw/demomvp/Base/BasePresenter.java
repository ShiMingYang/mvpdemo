package com.sqw.demomvp.Base;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

public abstract class BasePresenter<v extends BaseView> {
    protected v Mview;

    protected ArrayList<BaseModel> models = new ArrayList<>();

    public void  bind(v baseview) {

        WeakReference<v> weakReference = new WeakReference<>(baseview);

        v v = weakReference.get();

        this.Mview =baseview;
    }

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();

    public void OnDestroy(){
        Mview=null;
        for (BaseModel model : models) {
            model.onDestory();
            models.clear();
        }

    }
}
