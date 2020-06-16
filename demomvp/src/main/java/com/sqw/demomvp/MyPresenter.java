package com.sqw.demomvp;

import com.sqw.demomvp.Base.BasePresenter;
import com.sqw.demomvp.httpUtils.ResultCallBack;

public class MyPresenter extends BasePresenter<MyView> {

    private MyModel myModel;

    @Override
    protected void initModel() {
        myModel = new MyModel();
    }

    public void getData() {
        myModel.getData(new ResultCallBack<ListBean>() {
            @Override
            public void onSuccess(ListBean bean) {
                if (bean!=null) {
                    Mview.OnSuccess(bean);
                }
            }

            @Override
            public void onFail(String msg) {
                Mview.OnFail(msg);
            }
        });
    }

    @Override
    public void OnDestroy() {
        super.OnDestroy();
        if (Mview==null) {
            Mview=null;
        }
    }
}
