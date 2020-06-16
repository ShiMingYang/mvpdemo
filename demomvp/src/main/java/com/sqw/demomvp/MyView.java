package com.sqw.demomvp;

import com.sqw.demomvp.Base.BaseView;

public interface MyView extends BaseView {

    void OnSuccess(ListBean bean);
    void OnFail(String msg);
}
