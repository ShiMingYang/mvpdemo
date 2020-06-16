package com.sqw.demomvp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sqw.demomvp.Base.BaseActivity;
import com.sqw.demomvp.httpUtils.ToastUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MyPresenter, MyView> implements MyView{


    @BindView(R.id.tv)
    TextView tv;
    private List<ListBean.DataBean.DatasBean> list;

    @Override
    protected void addListener() {

    }

    @Override
    protected void initData() {
        presenter.getData();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected MyPresenter initpresenter() {
        return new MyPresenter();
    }

    @Override
    protected int getlayoutId() {
        return R.layout.activity_main;
    }



    @OnClick(R.id.tv)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv:
                tv.setText("这是MVP");
                ToastUtil.showShort(list.toString());
                break;
        }
    }

    @Override
    public void OnSuccess(ListBean bean) {
        list = bean.getData().getDatas();
        tv.setText(list.get(0).getChapterName());
    }

    @Override
    public void OnFail(String msg) {
        ToastUtil.showShort(msg);
    }


}
